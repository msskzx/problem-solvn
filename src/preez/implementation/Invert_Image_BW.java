package preez.implementation;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

public class Invert_Image_BW {

	static BufferedImage bi;
	static Color c;
	static ImageWriter output;

	public static void main(String[] args) throws IOException {
		bi = ImageIO.read(new File("img/batman.png"));

		for (int i = 0; i < bi.getHeight(); i++) {
			for (int j = 0; j < bi.getWidth(); j++) {
				c = new Color(bi.getRGB(j, i));
				if (c.getRGB() == Color.black.getRGB()) {
					bi.setRGB(j, i, 0);
				} else {
					bi.setRGB(j, i, 0xffffff);
				}
			}
		}

		File outputfile = new File("img/batman returns.png");
		ImageIO.write(bi, "png", outputfile);
	}

}
