public class Problem3 {

    static String findMinMaxSpread(int[] scores) {

        // Assume the first element is initially
        // both the minimum and maximum
        int min = scores[0];
        int max = scores[0];

        // Start from index 1 because index 0
        // was already used for initialization
        for (int i = 1;
             i < scores.length;
             i++) {

            // Check whether current value is smaller
            if (scores[i] < min) {
                min = scores[i];
            }

            // Check whether current value is larger
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        // Calculate difference
        int spread = max - min;

        // Return final formatted result
        return "Min: " + min
                + " | Max: " + max
                + " | Spread: " + spread;
    }

    public static void main(String[] args) {

        int[] scores = {
            45, 82, 79, 90, 33, 90, 61
        };

        System.out.println(
            findMinMaxSpread(scores)
        );
    }
}
