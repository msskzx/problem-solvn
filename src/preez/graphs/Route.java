package preez.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Route {

	/*
	 * Given a directed graph, design an algorithm to find out whether there is
	 * a route between two nodes
	 * 
	 * input:
	 * 
	 * NO. vertices NO. edges
	 * 
	 * Vertex neighbor
	 * Vertex neighbor
	 * 
	 * source target
	 * 
	 */

	static Scanner sc = new Scanner(System.in);
	static int v, e, src, target, cur;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> g;
	static Queue<Integer> queue = new LinkedList<>();

	static boolean isReachable(int src, int target) {
		visited = new boolean[v + 1];
		if (src == target)
			return true;

		queue.add(src);
		visited[src] = true;

		while (!queue.isEmpty()) {
			src = queue.remove();

			while (!g.get(src).isEmpty()) {
				cur = g.get(src).remove(0);
				if (cur == target) {
					return true;
				}

				if (!visited[cur]) {
					queue.add(cur);
					visited[cur] = true;
				}

			}

		}
		return false;
	}

	public static void main(String[] args) {
		v = sc.nextInt();
		e = sc.nextInt();
		g = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < v + 1; i++)
			g.add(new ArrayList<Integer>());

		for (int i = 0; i < e; i++) {
			src = sc.nextInt();
			target = sc.nextInt();
			g.get(src).add(target);
		}

		src = sc.nextInt();
		target = sc.nextInt();

		System.out.println(isReachable(src, target));

	}

}
