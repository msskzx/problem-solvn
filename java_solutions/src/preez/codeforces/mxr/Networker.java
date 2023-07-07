package preez.codeforces.mxr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Networker {

	static int[] input;
	static int[] original;
	static Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	static ArrayList<Integer> usedHubs = new ArrayList<Integer>();
	static ArrayList<Integer> tmp = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("lan.in"));
		PrintWriter pr = new PrintWriter("lan.out");

		StringTokenizer tok = new StringTokenizer(br.readLine());
		int users = Integer.parseInt(tok.nextToken());
		int hub = Integer.parseInt(tok.nextToken());
		tok = new StringTokenizer(br.readLine());

		input = new int[hub];
		original = new int[hub];

		for (int i = 0; i < hub; i++) {
			input[i] = Integer.parseInt(tok.nextToken());
		}

		for (int i = 0; i < hub; i++) {
			tmp = map.get(input[i]);
			if (tmp == null) {
				tmp = new ArrayList<>();
			}
			tmp.add(i + 1);
			map.put(input[i], tmp);
		}

		Arrays.sort(input);

		for (int i = 0; i < hub; i++) {
			original[i] = input[i];
		}

		boolean found = false;
		// check if number reaches zero
		for (int i = hub - 1; i >= 0; i--) {
			if (users <= input[i]) {
				users = 0;
				tmp = map.get(original[i]);
				usedHubs.add(tmp.get(0));
				tmp.remove(0);
				found = true;
				break;
			} else {
				users = users - (input[i] - 1);
				tmp = map.get(original[i]);
				usedHubs.add(tmp.get(0));
				tmp.remove(0);
				if (i > 0) {
					input[i - 1] = input[i - 1] - 1;
				}
			}
		}

		if (found && users == 0) {
			pr.println(usedHubs.size());
			for (int x : usedHubs) {
				pr.printf("%d ", x);
			}
		} else
			pr.println("Epic fail");

		pr.flush();
		br.close();
		pr.close();
	}

}
