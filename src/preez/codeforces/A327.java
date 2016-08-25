package preez.codeforces;

import java.util.Scanner;

public class A327 {

	static Scanner sc = new Scanner(System.in);
	static int n, max, cur, ones;

	public static void main(String[] args) {
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() == 0)
				cur++;
			else {
				ones++;
				max = Math.max(max, cur);
				cur = 0;
			}
		}
		
		max = Math.max(cur, max);
		
		System.out.println(max==0?0:max+ones);
	}

}
