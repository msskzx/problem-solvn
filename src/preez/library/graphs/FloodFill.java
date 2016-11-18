package preez.library.graphs;

public class FloodFill {

	static char[][] a;
	static int N, M;

	// S,SE,E,NE,N,NW,W,SW neighbors
	static int dr[] = { 1, 1, 0, -1, -1, -1, 0, 1 };
	static int dc[] = { 0, 1, 1, 1, 0, -1, -1, -1 };

	static int floodFill(int i, int j, char c1, char c2) {
		if (i >= N || i < 0 || j >= M || j < 0 || a[i][j] != c1)
			return 0;
		a[i][j] = c2;
		int ans = 1;
		for (int k = 0; k < dr.length; k++)
			ans += floodFill(i + dr[k], j + dc[k], c1, c2);
		return ans;
	}

}
