package mayhem.implementation;

public class Count_Color_Ways {

	/*
	 * Given the number of points on the line and the number of colors you have,
	 * find the number of the ways to color each point into one of the given
	 * colors in such manner that each two adjacent points will be different
	 * color.
	 */

	int countLineColorings(int points, int colors) {
		int result = colors;
		for (int i = 1; i < points; i++) {
			result *= colors - 1;
		}
		return result;
	}

}
