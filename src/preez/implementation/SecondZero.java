package preez.implementation;

public class SecondZero {

	/*
	 * Presented with the integer n, find the 0-based position of the second
	 * rightmost zero bit in its binary representation (it is guaranteed that
	 * such a bit exists), counting from right to left.
	 */

	static int f(int n) {
		return (((n | (n + 1)) + 1) & ~(n | (n + 1)));
	}

	public static void main(String[] args) {
		System.out.println(f(37));
	}

}
