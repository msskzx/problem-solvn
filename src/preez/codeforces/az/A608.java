package preez.codeforces.az;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A608 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int time, arr, n, prev, cur;
	static int[] floors;
	static int[] arrivals;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		prev = Integer.parseInt(st.nextToken());
		floors = new int[n];
		arrivals = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			floors[i] = Integer.parseInt(st.nextToken());
			arrivals[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = n - 1; i > -1; i--) {
			time +=(prev-floors[i]);
			if(arrivals[i]>time){
				time+=(arrivals[i]-time);
			}
			prev = floors[i];
		}
		time+= (prev-0);
		System.out.println(time);
	}

}
