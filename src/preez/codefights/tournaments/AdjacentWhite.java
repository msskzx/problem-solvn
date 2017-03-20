package preez.codefights.tournaments;

public class AdjacentWhite {

	/**
	 * https://codefights.com/tournaments/hrN6JSCrRoJWnfLEY/C
	 * 
	 * @param matrix
	 * @return
	 */

	static boolean[][] holesErasing(boolean[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				if (!matrix[i][j] && !adj(matrix, i, j))
					matrix[i][j] = true;
		return matrix;
	}

	static boolean adj(boolean[][] matrix, int i, int j) {
		int[] r = { 1, 1, 0, -1, -1, -1, 0, 1 };
		int[] c = { 0, 1, 1, 1, 0, -1, -1, -1 };

		for (int k = 0; k < r.length; k++) {
			int x = i + r[k];
			int y = j + c[k];
			if (!(x >= matrix.length || y >= matrix[0].length || x < 0 || y < 0) && !matrix[x][y])
				return true;
		}
		return false;
	}

}
