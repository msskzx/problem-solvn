package preez.codefights.arcade.graphs;

public class FriendGroups {

	static int N = 0;
	static int[][] g;

	static int friendGroups(int n, int[][] f) {
		g = new int[n][n];
		int c = 0, x, y;
		N = n;

		for (int i = 0; i < f.length; i++) {
			x = f[i][0];
			y = f[i][1];
			g[x][y] = g[y][x] = 1;
		}

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (g[i][j] == 1) {
					f(i, j);
					c++;
				}
		int d = n;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (g[i][j] == 2) {
					d--;
					break;
				}
		return c + d;
	}

	static void f(int i, int j) {
		if (g[i][j] != 1)
			return;

		for (int k = j; k < N; k++)
			if (g[i][k] == 1) {
				g[i][k] = 2;
				f(k, i);
			}
	}

}
