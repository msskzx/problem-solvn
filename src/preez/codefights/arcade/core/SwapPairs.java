package preez.codefights.arcade.core;

public class SwapPairs {

	/**
	 * https://codefights.com/arcade/code-arcade/corner-of-0s-and-1s/
	 * dShYZZT4WmvpmfpgB
	 * 
	 * @param n
	 * @return
	 */

	static int f(int n) {
		return ((n & 0b10101010101010101010101010101010) >> 1) | ((n & 0b01010101010101010101010101010101) << 1);
	}

	public static void main(String[] args) {
		System.out.println(f(13));
	}

}
