package preez.implementation;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

public class Create_Image_BW {

	static PrintWriter pr;
	static BufferedImage bi;
	static Color c;
	static Color[][] a;
	static ImageWriter output;

	public static void main(String[] args) throws IOException {
		bi = ImageIO.read(new File("D:\\batman.jpg"));
		a = new Color[bi.getHeight()][bi.getWidth()];
		pr = new PrintWriter("D:/gray.txt");

		for (int i = 0; i < bi.getHeight(); i++) {
			for (int j = 0; j < bi.getWidth(); j++) {
				c = new Color(bi.getRGB(j, i));
				if (c == Color.black) {
					a[i][j] = c;
				} else {
					a[i][j] = Color.white;
				}
				pr.printf("%d ", a[i][j].getBlue());
			}
			pr.println();

		}

		pr.flush();
		pr.close();

	}

}
