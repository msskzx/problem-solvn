package preez.implementation;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

public class Eight_Values_GSI {

	/*
	 * Convert a gray scale image where each pixel is represented in 8 bits to
	 * another image having 8 values only and write this image.
	 */

	static BufferedImage bi;
	static Color c;
	static ImageWriter output;
	static int[] grays = { 0x202020, 0x404040, 0x606060, 0x808080, 0xA0A0A0, 0xC0C0C0, 0xE0E0E0, 0xFFFFFF };

	public static void main(String[] args) throws IOException {
		bi = ImageIO.read(new File("img/gsi.jpg"));

		for (int i = 0; i < bi.getHeight(); i++) {
			for (int j = 0; j < bi.getWidth(); j++) {
				c = new Color(bi.getRGB(j, i));
				bi.setRGB(j, i, grays[Math.round(c.getBlue() / 32)]);
			}
		}

		File outputfile = new File("img/8values.jpg");
		ImageIO.write(bi, "jpg", outputfile);
	}

}
