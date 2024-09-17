package codefights.tournaments;

public class PawnRace {

	/**
	 * not solved...
	 * 
	 * Recovery
	 * 
	 * https://codefights.com/tournaments/fSsRqhehhTpgRXxzJ/B
	 * 
	 * @param white
	 * @param black
	 * @param toMove
	 * @return
	 */

	String pawnRace(String white, String black, char toMove) {
		int wHor = white.charAt(1) - '0';
		int wVert = white.charAt(0) - 'a';
		int bHor = black.charAt(1) - '0';
		int bVert = black.charAt(0) - 'a';
		if (wVert == bVert && wHor < bHor) {
			return "draw";
		}
		if (Math.abs(wVert - bVert) != 1 || wHor >= bHor) {
			int wRest = Math.min(8 - wHor, 5);

			// recovery
			int bRest = 0;
			//

			if (wRest < bRest || wRest == bRest && toMove == 'w') {
				return "white";
			}
			return "black";
		}
		int[][] winningPairs = { { 2, 5 }, { 2, 6 }, { 3, 6 }, { 4, 7 } };
		if (toMove == 'w') {
			for (int i = 0; i < 4; i++) {
				if (wHor == winningPairs[i][0] && bHor == winningPairs[i][1]) {
					return "white";
				}
			}
			if (wHor + 1 == bHor) {
				return "white";
			}
			return "black";
		} else {
			for (int i = 0; i < 4; i++) {
				if (wHor == 9 - winningPairs[i][1] && bHor == 9 - winningPairs[i][0]) {
					return "black";
				}
			}
			if (wHor + 1 == bHor) {
				return "black";
			}
			return "white";
		}
	}

}
