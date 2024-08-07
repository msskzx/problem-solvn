package mayhem.recursion;

import java.util.ArrayList;

public class StringCombinations {

	static char[] a;
	static int n;
	static ArrayList<Character> output = new ArrayList<Character>();

	public static void f(int pos) {
		print();
		for (int i = pos; i < n; i++) {
			output.add(a[i]);
			f(i + 1);
			output.remove(output.size()-1);
		}
	}

	public static void print() {
		for (char c : output)
			System.out.print(c);
		System.out.println();
	}

	public static void main(String[] args) {
		String s = "abc";
		n = s.length();
		a = s.toCharArray();
		f(0);
	}

}
