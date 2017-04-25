package preez.codeforces.bc9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C717 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, ans;
	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(br.readLine());

		Arrays.sort(a);

		for (int i = 0; i < n; i++) {
			ans += ((a[i] % 10007) * (a[n - i - 1] % 10007)) % 10007;
			ans %= 10007;
		}

		System.out.println(ans);

	}

}
