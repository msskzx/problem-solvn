package preez.library.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> g;
	static ArrayList<Integer> path;

	static void bfs(int src) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(src);

		while (!queue.isEmpty()) {
			int cur = queue.remove();
			for (int i = 0; i < g.get(cur).size(); i++) {
				int v = g.get(cur).get(i);
				if (!visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		g = new ArrayList<ArrayList<Integer>>();
		visited = new boolean[v];
		path = new ArrayList<>();

		for (int i = 0; i < v; i++)
			g.add(new ArrayList<Integer>());

		for (int i = 0; i < e; i++) {
			int src = sc.nextInt();
			int target = sc.nextInt();
			g.get(src).add(target);
		}
		sc.close();

		for(int i = 0;i<v;i++)
			if(!visited[i])
				bfs(i);
		
	}

}
