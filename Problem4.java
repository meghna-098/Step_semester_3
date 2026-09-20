public class Problem4 {

    // Helper method
    // Calculates the average of one row
    static double rowAverage(int[] row) {

        int sum = 0;

        // Add every value in the row
        for (int value : row) {
            sum = sum + value;
        }

        // Convert sum to double before division
        // so that we get a decimal average.
        return (double) sum / row.length;
    }

    // Classifies every row
    static String classifyRows(int[][] seatingScores, int threshold) {

        StringBuilder result = new StringBuilder();

        // Visit every row
        for (int i = 0; i < seatingScores.length; i++) {

            // Calculate average exactly once
            double average = rowAverage(seatingScores[i]);

            // Add separator between rows
            if (i > 0) {
                result.append(" | ");
            }

            // Decide which zone the row belongs to
            if (average < threshold) {

                result.append("Row ")
                      .append(i)
                      .append(": Quiet Zone");

            } else {

                result.append("Row ")
                      .append(i)
                      .append(": Buzzing Zone");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        int[][] seatingScores = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };

        int threshold = 60;

        String result = classifyRows(
            seatingScores,
            threshold
        );

        System.out.println(result);
    }
}
