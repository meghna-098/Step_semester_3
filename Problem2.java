public class Problem2 {

    static class Scorecard {

        // Private array
        private boolean[] results;

        // Number of answers recorded
        private int answerCount;

        // Constructor
        public Scorecard(int totalQuestions) {

            results = new boolean[totalQuestions];

            answerCount = 0;
        }

        // Record next answer
        public void recordAnswer(boolean correct) {

            // Check if all questions are already recorded
            if (answerCount >= results.length) {

                System.out.println(
                    "Answer rejected: all questions are already recorded"
                );

                return;
            }

            // Store answer
            results[answerCount] = correct;

            // Move to next position
            answerCount++;
        }

        // Return total correct answers
        public int getScore() {

            int score = 0;

            for (int i = 0; i < answerCount; i++) {

                if (results[i]) {
                    score++;
                }
            }

            return score;
        }
    }

    public static void main(String[] args) {

        Scorecard sc =
            new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println(
            "Score: " + sc.getScore()
        );

        // Extra answer - rejected
        sc.recordAnswer(true);
    }
}
