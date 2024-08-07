package codeforces.cfr386;

import java.util.Scanner;

public class A746 {

	static Scanner sc = new Scanner(System.in);
	static int a, b, c;

	public static void main(String[] args) {
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		for(int i = a;i>=0;i--) {
			if(i==0)
				System.out.println(0);
			else 
				if(i*2<=b && i*4<=c) {
					System.out.println(7*i);				
					break;
				}
		}
	}

}
