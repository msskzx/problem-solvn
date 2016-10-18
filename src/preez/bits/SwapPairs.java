package preez.bits;

public class SwapPairs {

	/*
	 * https://codefights.com/arcade/code-arcade/corner-of-0s-and-1s/
	 * dShYZZT4WmvpmfpgB
	 * 
	 * You're given an arbitrary 32-bit integer n. Swap each pair of adjacent
	 * bits in its binary representation and return the result as a decimal
	 * number.
	 * 
	 * it works by handling the low bits and high bits of each bit-pair
	 * separately and then combining the result:
	 * 
	 * The expression x & 0b10101010 extracts the high bit from each pair, and
	 * then >> 1 shifts it to the low bit position.
	 * 
	 * Similarly the expression (x & 0b01010101) << 1 extracts the low bit from
	 * each pair and shifts it to the high bit position.
	 * 
	 * The two parts are then combined using bitwise-OR.
	 */

	static int f(int n) {
		return ((n & 0b10101010101010101010101010101010) >> 1) | ((n & 0b01010101010101010101010101010101) << 1);
	}

	public static void main(String[] args) {
		System.out.println(f(13));
	}

}
