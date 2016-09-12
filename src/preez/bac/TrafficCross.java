package preez.bac;

public class TrafficCross {

	boolean crossroads(int[] road1, int[] road2, int crossTime) {
		int j = 0;
		for (int i = 0; i < road1.length; i++) {
			// check while condition
			while (j++ < 100) {
				if (road2[j] + crossTime > road1[i]) {
					return true;
				}
				j++;
			}
			if (j < road2.length && road1[i] + crossTime > road2[j]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
