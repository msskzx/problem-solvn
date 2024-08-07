package codeforces.aim_tech_round;

import java.util.Scanner;

public class A624 {
	
	static Scanner sc = new Scanner(System.in);
	static int d,l,v1,v2,x;
	static double t;

	public static void main(String[] args) {
		d = sc.nextInt();
		l = sc.nextInt();
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		
		x = l - d;
		
		t = x*1.0/(v1+v2);
		System.out.println(t);
	}

}
