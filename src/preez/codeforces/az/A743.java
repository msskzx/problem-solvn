package preez.codeforces.az;

import java.util.Scanner;

public class A743 {
	
	static Scanner sc = new Scanner(System.in);
	static String s;

	public static void main(String[] args) {
		sc.nextInt();
		s = sc.next();
		int a, d;
		a = d = 0;
		for(int i = 0;i< s.length();i++)
			if(s.charAt(i) == 'A')
				a++;
			else
				d++;
		if(a == d)
			System.out.println("Friendship");
		else
			System.out.println(a>d?"Anton":"Danik");
	}

}
