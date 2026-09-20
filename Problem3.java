import java.util.Arrays;

public class Problem3 {

    static int[] findTopThreeScores(int[] scores) {

        // Start with the smallest possible integer.
        // This allows any normal score to replace it.
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        // Visit every score exactly once
        for (int score : scores) {

            // If score is greater than or equal to first
            if (score >= first) {

                // Old second moves to third
                third = second;

                // Old first moves to second
                second = first;

                // New score becomes first
                first = score;
            }

            // Otherwise, check whether score belongs in second
            else if (score >= second) {

                // Old second moves to third
                third = second;

                // Current score becomes second
                second = score;
            }

            // Otherwise, check whether score belongs in third
            else if (score >= third) {

                third = score;
            }
        }

        // Return top three scores
        return new int[]{first, second, third};
    }

    public static void main(String[] args) {

        int[] scores = {
            45, 82, 79, 90, 33, 90, 61
        };

        int[] result = findTopThreeScores(scores);

        System.out.println(Arrays.toString(result));
    }
}
