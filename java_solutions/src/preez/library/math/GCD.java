package preez.library.math;

public class GCD {

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

}
