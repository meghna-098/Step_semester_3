public class Problem4 {

    // Helper method
    // Calculates average of one row
    private static double rowAverage(int[] row) {

        int sum = 0;

        // Add every value in the row
        for (int value : row) {
            sum = sum + value;
        }

        // Convert to double before division
        return (double) sum / row.length;
    }

    // Classify every match
    static String classifyMatches(
            int[][] runsPerOver,
            int threshold) {

        StringBuilder result =
                new StringBuilder();

        // Visit every match
        for (int i = 0;
             i < runsPerOver.length;
             i++) {

            // Calculate average exactly once
            double average =
                    rowAverage(runsPerOver[i]);

            // Add separator between results
            if (i > 0) {
                result.append(" | ");
            }

            // Decide category
            if (average >= threshold) {

                result.append("Match ")
                      .append(i)
                      .append(": Power Surge");

            } else {

                result.append("Match ")
                      .append(i)
                      .append(": Normal");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        int[][] runsPerOver = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };

        int threshold = 8;

        String result =
                classifyMatches(
                    runsPerOver,
                    threshold
                );

        System.out.println(result);
    }
}
