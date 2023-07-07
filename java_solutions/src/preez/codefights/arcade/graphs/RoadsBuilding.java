package preez.codefights.arcade.graphs;

import java.util.ArrayList;

public class RoadsBuilding {

	/**
	 * https://codefights.com/arcade/graphs-arcade/kingdom-roads/
	 * CSzczQWdnYwmyEjvv/description/gYAJsnoBA2Pdffx85
	 * 
	 * Bitlin wanted each pair of cities to be connected, but couldn't find a
	 * way to figure out which roads are missing. Desperate, he turned to his
	 * magic crystal, seeking help. The crystal showed him a programmer from the
	 * distant future: you! Now you're the only one who can save the kingdom.
	 * Given the existing roads and the number of cities in the kingdom, you
	 * should use the most modern technologies and find out what roads should be
	 * built again to make each pair of cities connected. Since the magic
	 * crystal is quite old and meticulous, it will only transfer the
	 * information that is sorted properly.
	 * 
	 * The roads to be built should be returned in an array sorted
	 * lexicographically, with each road stored as [cityi, cityj], where cityi <
	 * cityj.
	 * 
	 * Example
	 * 
	 * For cities = 4 and roads = [[0, 1], [1, 2], [2, 0]], the output should be
	 * roadsBuilding(cities, roads) = [[0, 3], [1, 3], [2, 3]].
	 * 
	 * @param n
	 * @param x
	 * @return
	 */
	int[][] roadsBuilding(int n, int[][] x) {
		boolean[][] a = new boolean[n][n];
		ArrayList<int[]> list = new ArrayList<>();

		for (int i = 0; i < x.length; i++) {
			a[x[i][0]][x[i][1]] = a[x[i][1]][x[i][0]] = true;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && !a[i][j]) {
					int[] t = { i, j };
					list.add(t);
					a[j][i] = true;
				}
			}
		}
		int[][] o = new int[list.size()][];
		for (int i = 0; i < list.size(); i++)
			o[i] = list.remove(0);

		return o;
	}

}
