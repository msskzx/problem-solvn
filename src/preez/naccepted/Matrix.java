package preez.naccepted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Matrix {
	static int[][] matrix;

	public static void main(String[] args) throws IOException {
		// TODO WA
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(tok.nextToken());
		int col = Integer.parseInt(tok.nextToken());
		int q = Integer.parseInt(tok.nextToken());
		matrix = new int[row][col];
		// prepare stack
		Stack<String> exp = new Stack<String>();
		for (int i = 0; i < q; i++) {
			String s = br.readLine();
			tok = new StringTokenizer(s);
			int t = Integer.parseInt(tok.nextToken());
			if (t == 2 || t == 1) {
				exp.add(s);
			} else {
				int r = Integer.parseInt(tok.nextToken());
				int c = Integer.parseInt(tok.nextToken());
				int v = Integer.parseInt(tok.nextToken());
				matrix[r - 1][c - 1] = v;
			}
		}
		while (!exp.isEmpty()) {
			tok = new StringTokenizer(exp.pop());
			if (Integer.parseInt(tok.nextToken()) == 1)
				shiftRow(Integer.parseInt(tok.nextToken()) - 1);
			else
				shiftCol(Integer.parseInt(tok.nextToken()) - 1);

		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void shiftRow(int row) {
		for (int i = row; i < matrix[row].length - 1; i++) {
			int temp = matrix[row][i];
			matrix[row][i] = matrix[row][i + 1];
			matrix[row][i + 1] = temp;
		}

	}

	public static void shiftCol(int col) {
		for (int i = 0; i < matrix.length - 1; i++) {
			int temp = matrix[i][col];
			matrix[i][col] = matrix[i + 1][col];
			matrix[i + 1][col] = temp;
		}
	}
}
