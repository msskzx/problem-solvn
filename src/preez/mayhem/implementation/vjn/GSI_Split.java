package preez.mayhem.implementation.vjn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GSI_Split {

	static BufferedImage image, binary_image, fg_image, bg_image;

	static double image_entropy, fg_entropy, bg_entropy, info_gain1, info_gain2;

	// histograms
	static int[] hist_image;
	static int[] hist_fg;
	static int[] hist_bg;

	// probabilities
	static double[] p_image;
	static double[] p_fg;
	static double[] p_bg;

	static int N = 256, PIXELS;

	static int[] histogram(BufferedImage image) {
		int[] a = new int[N];
		Color c;
		for (int i = 0; i < image.getHeight(); i++)
			for (int j = 0; j < image.getWidth(); j++) {
				c = new Color(image.getRGB(j, i));
				a[c.getBlue()]++;
			}
		return a;
	}

	static double[] probability(int[] freq) {
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
			a[i] = freq[i] * 1.0 / PIXELS;
		return a;
	}

	/**
	 * this is equivalent to log2(1/p)
	 * 
	 * @param p
	 *            probability
	 * @return
	 */
	static double selfInfo(double p) {
		return Math.log10(1 / p) / Math.log10(2);
	}

	/**
	 * Otsu Thresholding
	 * 
	 * http://www.labbookpages.co.uk/software/imgProc/otsuThreshold.html
	 * 
	 * @return
	 */
	static int threshold() {
		float sum = 0;
		for (int i = 0; i < 256; i++)
			sum += i * hist_image[i];

		float sumB = 0, varMax = 0;
		int wB = 0, wF = 0, threshold = 0;

		for (int i = 0; i < 256; i++) {
			// Weight Background
			wB += hist_image[i];
			if (wB == 0)
				continue;

			// Weight Foreground
			wF = PIXELS - wB;
			if (wF == 0)
				break;

			sumB += (float) (i * hist_image[i]);

			// Mean Background
			float mB = sumB / wB;

			// Mean Foreground
			float mF = (sum - sumB) / wF;

			// Calculate Between Class Variance
			float varBetween = (float) wB * (float) wF * (mB - mF) * (mB - mF);

			// Check if new maximum found
			if (varBetween > varMax) {
				varMax = varBetween;
				threshold = i;
			}
		}
		return threshold;
	}

	static void binary() {
		int threshold = threshold();

		for (int i = 0; i < image.getHeight(); i++)
			for (int j = 0; j < image.getWidth(); j++) {
				Color c = new Color(image.getRGB(j, i));
				int x = 0;
				if (c.getBlue() > threshold)
					x = 0xffffff;
				binary_image.setRGB(j, i, x);
			}
	}

	/**
	 * Extract the foreground from the original image.
	 */
	static void fg() {
		for (int i = 0; i < image.getHeight(); i++)
			for (int j = 0; j < image.getWidth(); j++) {
				Color c = new Color(binary_image.getRGB(j, i));
				if (c.getBlue() == 0)
					fg_image.setRGB(j, i, 0);
			}
	}

	/**
	 * Extract the background from the original image.
	 */
	static void bg() {
		for (int i = 0; i < image.getHeight(); i++)
			for (int j = 0; j < image.getWidth(); j++) {
				Color c = new Color(binary_image.getRGB(j, i));
				if (c.getBlue() != 0)
					bg_image.setRGB(j, i, 0);
			}
	}

	/**
	 * 
	 * @param p
	 *            probability
	 * @return
	 */
	static double entropy(double[] p) {
		double sum = 0;
		for (int i = 0; i < N; i++)
			if (p[i] > 0)
				sum += (p[i] * selfInfo(p[i]));
		return sum;
	}

	public static void main(String[] args) throws IOException {
		image = ImageIO.read(new File("img/gsi.jpg"));
		binary_image = ImageIO.read(new File("img/gsi.jpg"));
		fg_image = ImageIO.read(new File("img/gsi.jpg"));
		bg_image = ImageIO.read(new File("img/gsi.jpg"));

		PIXELS = image.getWidth() * image.getHeight();

		hist_image = histogram(image);

		binary();
		fg();
		bg();

		File outputfile;

		// binary image
		outputfile = new File("img/split_binary.jpg");
		ImageIO.write(binary_image, "jpg", outputfile);

		// foreground
		outputfile = new File("img/split_fg.jpg");
		ImageIO.write(fg_image, "jpg", outputfile);

		// background
		outputfile = new File("img/split_bg.jpg");
		ImageIO.write(bg_image, "jpg", outputfile);

		// original
		p_image = probability(hist_image);
		image_entropy = entropy(p_image);

		// foreground
		hist_fg = histogram(fg_image);
		p_fg = probability(hist_fg);
		fg_entropy = entropy(p_fg);

		// background
		hist_bg = histogram(bg_image);
		p_bg = probability(hist_bg);
		bg_entropy = entropy(p_bg);

		// information gain
		info_gain1 = image_entropy - bg_entropy;
		info_gain2 = image_entropy - fg_entropy;

	}

}
