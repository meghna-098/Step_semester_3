import java.util.Scanner;

public class MovieReviewWordProfiler {

    static void classifyWordLengths(String review) {

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        String[] words = review.trim().split("\\s+");

        for (String word : words) {

            // Remove punctuation
            word = word.replaceAll("[^a-zA-Z]", "");

            int length = word.length();

            if (length >= 1 && length <= 4) {

                shortWords++;

            } else if (length >= 5 && length <= 8) {

                mediumWords++;

            } else if (length >= 9) {

                longWords++;
            }
        }

        System.out.println(
            "Short: " + shortWords
            + " | Medium: " + mediumWords
            + " | Long: " + longWords
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        classifyWordLengths(review);

        sc.close();
    }
}
