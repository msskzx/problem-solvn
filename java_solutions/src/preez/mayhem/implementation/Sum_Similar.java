package preez.mayhem.implementation;

public class Sum_Similar {

	/*
	 * singleDigitGeneratedNumbers(8, 35) = 83
	 * 
	 * because 8 + 9 + 11 + 22 + 33 = 83.
	 */

	// TLE
	static int singleDigitGeneratedNumbers(int L, int R) {
		int sum = 0;
		int i = L;
		while (i <= R) {
			if (i < 10) {
				sum += i;
				sum %= 1000000007;
				i++;
			} else {
				String s = i + "";
				char prev = s.charAt(0);
				boolean flag = true;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) != prev) {
						flag = false;
						break;
					}
				}
				if (flag) {
					sum += i;
					i += Math.pow(10, s.length() - 1);
				} else
					i++;
			}
		}
		return sum % 1000000007;
	}

	// IDK why
	static int singleDigitGeneratedNumbers2(int L, int R) {
		long ans = 0;
		for (int i = 1; i < 10; i++) {
			long x = 0;
			while (x <= R) {
				if (x >= L)
					ans += x;
				x = 10 * x + i;
			}
		}
		return (int)(ans % 1000000007);
	}

	public static void main(String[] args) {
		System.out.println(singleDigitGeneratedNumbers2(8, 35));
	}

}
