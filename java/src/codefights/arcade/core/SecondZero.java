package codefights.arcade.core;

public class SecondZero {

	/**
	 * https://codefights.com/arcade/code-arcade/corner-of-0s-and-1s/
	 * 9nSj6DgqLDsBePJha
	 * 
	 * Presented with the integer n, find the 0-based position of the second
	 * rightmost zero bit in its binary representation (it is guaranteed that
	 * such a bit exists), counting from right to left.
	 * 
	 * @param n
	 * @return
	 */

	static int f(int n) {
		return (((n | (n + 1)) + 1) & ~(n | (n + 1)));
	}

	public static void main(String[] args) {
		System.out.println(f(37));
	}

}
