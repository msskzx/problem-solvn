package preez.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bicoloring_10004 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));

	static ArrayList<ArrayList<Integer>> g;
	static ArrayList<Integer> path;

	static boolean bfs(int n) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);

		int[] color = new int[n];

		Arrays.fill(color, -1);

		while (!queue.isEmpty()) {
			int cur = queue.remove();
			for (int i = 0; i < g.get(cur).size(); i++) {
				int v = g.get(cur).get(i);
				if (color[v] == -1) {
					color[v] = 1 - color[cur];
					queue.add(v);
				} else {
					if (color[v] == color[cur]) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		while (true) {

			int v = Integer.parseInt(br.readLine());
			if (v == 0)
				break;
			int e = Integer.parseInt(br.readLine());

			g = new ArrayList<ArrayList<Integer>>();
			path = new ArrayList<>();

			for (int i = 0; i < v; i++)
				g.add(new ArrayList<Integer>());

			for (int i = 0; i < e; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int src = Integer.parseInt(st.nextToken());
				int target = Integer.parseInt(st.nextToken());
				g.get(src).add(target);
				g.get(target).add(src);

			}

			pr.println(bfs(v) ? "BICOLORABLE." : "NOT BICOLORABLE.");
		}
		pr.flush();
		pr.close();
		br.close();
	}
}
