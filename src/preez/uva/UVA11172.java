package preez.uva;

import java.util.Scanner;

public class UVA11172 {
	
	static Scanner sc = new Scanner(System.in);
	static int t, a, b;

	public static void main(String[] args) {
		t = sc.nextInt();
		while(t-->0){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==b)
				System.out.println('=');
			else if(a>b)
				System.out.println('>');
			else
				System.out.println('<');
		}
	}

}
