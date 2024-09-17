package codefights.tournaments;

public class CountSundays {

	/**
	 * Bug fix
	 * 
	 * https://codefights.com/tournaments/hrN6JSCrRoJWnfLEY/A/solutions
	 * 
	 * @param n
	 * @param startDay
	 * @return
	 */
	int howManySundays(int n, String startDay) {

		String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		int startIndex = 0;

		for (int i = 0; i < week.length; i++) {
			if (week[i].equals(startDay)) {
				startIndex = i;
				break;
			}
		}

		return (int) Math.floor((double) (n + startIndex) / week.length);
	}

}
