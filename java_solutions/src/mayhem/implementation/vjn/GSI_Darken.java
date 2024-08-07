package mayhem.implementation.vjn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

public class GSI_Darken {

	/*
	 * Write a program that reads a gray scale image and darkens each pixel by
	 * 40
	 */

	static BufferedImage bi;
	static ImageWriter output;
	static Color c;
	static int x;

	public static void main(String[] args) throws IOException {
		bi = ImageIO.read(new File("img/gsi.jpg"));

		for (int i = 0; i < bi.getHeight(); i++) {
			for (int j = 0; j < bi.getWidth(); j++) {
				c = new Color(bi.getRGB(j, i));
				x = Math.max(0, c.getBlue() - 40);
				c = new Color(x, x, x);
				bi.setRGB(j, i, c.getRGB());
			}
		}

		File outputfile = new File("img/draken40.jpg");
		ImageIO.write(bi, "jpg", outputfile);
	}
}
