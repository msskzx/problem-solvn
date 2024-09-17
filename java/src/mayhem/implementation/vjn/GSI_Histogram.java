package mayhem.implementation.vjn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class GSI_Histogram {

	/*
	 * Write a program that reads a gray scale image and creates a 1D array
	 * histogram for this image.
	 */

	public static void main(String[] args) throws IOException {
		BufferedImage bi = ImageIO.read(new File("img/gsi.jpg"));
		PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
		int[] freq = new int[256];
		Color c;
		
		for (int i = 0; i < bi.getHeight(); i++) {
			for (int j = 0; j < bi.getWidth(); j++) {
				c = new Color(bi.getRGB(j, i));
				freq[c.getBlue()]++;
			}
		}

		pr.println(Arrays.toString(freq));

		pr.flush();
		pr.close();
	}

}
