package preez.library.graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> g;
	static ArrayList<Integer> path;

	static void dfs(int src) {
		visited[src] = true;
		for (int i = 0; i < g.get(src).size(); i++) {
			int cur = g.get(src).get(i);
			if (!visited[cur]) {
				dfs(cur);
			}
		}
		// for topological sort
		path.add(src);
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
				dfs(i);
		
		for(int i : path)
			System.out.println(i);
		
	}

}
