package preez.bac;

import java.util.Scanner;

public class B651 {

	static Scanner sc = new Scanner(System.in);
	static int n, count, cur;
	static int[] a;

	public static void main(String[] args) {
		n = sc.nextInt();
		a = new int[1001];

		for (int i = 0; i < n; i++) {
			a[sc.nextInt()]++;
		}

		for (int i = 0; i < 1001; i++) {
			count += Math.min(a[i], cur);
			cur = Math.abs(a[i] - cur);
			if(cur<=a[i])
				cur++;
		}

		System.out.println(count-1);

	}

}
