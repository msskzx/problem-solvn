package preez.implementation;

import java.util.Scanner;

public class M8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cur = 0, sum = 0;
		while (cur != -1) {
			sum += cur / 2.0;
			cur = sc.nextDouble();
		}
		sc.close();
		System.out.println(sum);
	}

}
