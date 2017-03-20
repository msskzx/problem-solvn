package preez.mayhem.implementation.vjn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class Gray_Scale_Image {

	/*
	 * Write a program that reads gray scale image and writes the values in a
	 * text file.
	 */

	static BufferedImage bi;
	static PrintWriter pr;
	static Color c;
	
	public static void main(String[] args) throws IOException {
		bi = ImageIO.read(new File("img/gsi.jpg"));
		pr = new PrintWriter("files/bwg.txt");

		for (int i = 0; i < bi.getHeight(); i++) {
			for (int j = 0; j < bi.getWidth(); j++) {
				c = new Color(bi.getRGB(j, i));
				pr.printf("%d ", c.getBlue());
			}
			pr.println();
		}
		
		pr.flush();
		pr.close();
	}

}
