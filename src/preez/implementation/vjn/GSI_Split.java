package preez.implementation.vjn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GSI_Split {

	// images
	static BufferedImage image, binary_image, fg_image, bg_image;

	// entropies
	static double image_entropy, fg_entropy, bg_entropy;

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

	static void binary() {

	}

	static void fg() {

	}

	static void bg() {

	}

	/**
	 * 
	 * @param pz
	 *            probability
	 * @return
	 */
	static double entropy(double[] pz) {
		double sum = 0;
		for (int i = 0; i < N; i++)
			sum += (pz[i] * selfInfo(pz[i]));
		return sum;
	}

	public static void main(String[] args) throws IOException {
		image = ImageIO.read(new File("img/gsi.jpg"));
		PIXELS = image.getWidth() * image.getHeight();

		hist_image = histogram(image);
		p_image = probability(hist_image);
		image_entropy = entropy(p_image);

		hist_fg = histogram(image);
		p_fg = probability(hist_image);
		fg_entropy = entropy(p_fg);

		hist_bg = histogram(image);
		p_bg = probability(hist_image);
		bg_entropy = entropy(p_bg);

	}

}
