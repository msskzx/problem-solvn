package codeforces.cfr138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B230 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n, root;
	static long cur, check;
	static StringTokenizer st;

	static boolean[] flags;

	static void sieve(int n) {
		flags = new boolean[n];
		Arrays.fill(flags, true);
		flags[0] = flags[1] = false;

		int prime = 2;

		while (prime <= ((int) Math.sqrt(n))) {
			crossOff(prime);
			prime = getNextPrime(prime);
		}
	}

	static void crossOff(int prime) {
		for (int i = prime * prime; i < flags.length; i += prime) {
			flags[i] = false;
		}
	}

	static int getNextPrime(int prime) {
		int next = prime + 1;
		while (next < flags.length && !flags[next]) {
			next++;
		}
		return next;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();

		sieve(1000001);

		for (int i = 0; i < n; i++) {
			cur = Long.parseLong(st.nextToken());
			root = (int) Math.sqrt(cur);
			check = root;
			check *=check;
			if (check == cur && flags[root])
				pr.println("YES");
			else
				pr.println("NO");
		}
		pr.flush();
		pr.close();
	}

}
