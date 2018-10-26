package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
        int maxIndex = (portfolios.length - 1);

        int mergedPortfolio;
        int bestMergedPortfolio = -1;

        for (int i = 0; i <= maxIndex-1; i++) {

            for (int j = i+1; j <= maxIndex; j++) {
                mergedPortfolio = portfolios[i] ^ portfolios[j];

                if (mergedPortfolio > bestMergedPortfolio) {
                    bestMergedPortfolio = mergedPortfolio;
                }
            }
		}
		
		return bestMergedPortfolio;
	}

}