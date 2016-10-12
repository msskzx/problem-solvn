package preez.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class ShortestReach {

	static Scanner sc = new Scanner(System.in);
	static int v, e, start, src, cur, t, dist;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> g;
	static Queue<Integer> queue = new LinkedList<>();
	static Map<Integer, Integer> map;

	static void shrtst() {
		map = new HashMap<Integer, Integer>();
		visited = new boolean[v + 1];
		dist = 0;
		queue.add(src);
		visited[src] = true;

		while (!queue.isEmpty()) {
			src = queue.remove();
			dist += 6;
			while (!g.get(src).isEmpty()) {
				cur = g.get(src).remove(0);
				if (!visited[cur]) {
					map.put(cur, dist);
					queue.add(cur);
					visited[cur] = true;
				}

			}

		}
	}

	public static void main(String[] args) {
		t = sc.nextInt();
		while (t-- > 0) {
			v = sc.nextInt();
			e = sc.nextInt();
			g = new ArrayList<ArrayList<Integer>>();

			for (int i = 0; i < v + 1; i++)
				g.add(new ArrayList<Integer>());

			for (int i = 0; i < e; i++) {
				src = sc.nextInt();
				int target = sc.nextInt();
				g.get(src).add(target);
				g.get(target).add(src);
			}

			start = src = sc.nextInt();
			shrtst();

			for (int i = 1; i <= v; i++) {
				if (start != i)
					if (map.get(i) != null)
						System.out.print(map.get(i) + " ");
					else
						System.out.print(-1 + " ");
			}
			System.out.println();
		}

	}
}
