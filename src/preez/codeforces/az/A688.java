package preez.codeforces.az;

import java.util.Scanner;

public class A688 {
	
	static Scanner sc =new Scanner(System.in);
	static int n,d,max,cur;
	static String s;

	public static void main(String[] args) {
		n = sc.nextInt();
		d = sc.nextInt();
		
		for(int i = 0;i<d;i++) {
			s = sc.next();
			if(s.contains("0"))
				cur++;
			else
				cur = 0;
			max = Math.max(cur, max);
		}
		max = Math.max(cur, max);
		System.out.println(max);
	}

}
