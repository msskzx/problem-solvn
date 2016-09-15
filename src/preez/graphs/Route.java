package preez.graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class Route {

	static Scanner sc = new Scanner(System.in);
	static int n, s, t;
	static boolean[] visited;
	static ArrayList<Integer>[] g;

	void f() {
		for(int i = 0;i<n;i++)
		{
			while(!g[i].isEmpty()){
				System.out.println(i+"->"+g[i].remove(0));
			}
		}
	}

	public static void main(String[] args) {
		n = sc.nextInt();
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			s = sc.nextInt();
			t = sc.nextInt();
			if (g[s] == null) {
				g[s] = new ArrayList<Integer>();
			}
			g[s].add(t);
		}
	}

}
