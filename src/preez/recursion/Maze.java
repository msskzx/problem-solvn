package preez.recursion;

import java.util.Scanner;

public class Maze {

	// topcoder recursion part 2
	// maze

	// 3
	// S..
	// **.
	// E..

	static Scanner sc = new Scanner(System.in);
	static int n, x, y;
	static char[][] maze;
	static String s;

	public static boolean maze(char[][] maze, int x, int y) {
		if (x < 0 || y < 0 || x >= n || y >= n || maze[x][y] == '*')
			return false;
		if (maze[x][y] == 'E')
			return true;

		maze[x][y] = '*';
		return maze(maze, x + 1, y) || maze(maze, x, y + 1) || maze(maze, x - 1, y) || maze(maze, x, y - 1);

	}

	public static void main(String[] args) {
		n = sc.nextInt();
		maze = new char[n][n];
		for (int i = 0; i < n; i++) {
			s = sc.next();
			for (int j = 0; j < n; j++) {
				maze[i][j] = s.charAt(j);
				if (maze[i][j] == 'S') {
					x = i;
					y = j;
				}
			}
		}
		System.out.println(maze(maze, x, y));

	}

}
