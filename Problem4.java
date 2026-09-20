public class Problem4 {

    static class Locker {

        // Private combination
        private String combination;

        // Final locker number
        private final int lockerNumber;

        // Constructor
        public Locker(
                int lockerNumber,
                String combination) {

            this.lockerNumber = lockerNumber;
            this.combination = combination;
        }

        // Change combination
        public void changeCode(
                String currentCode,
                String newCode) {

            // First verify old code
            if (currentCode.equals(combination)) {

                // Only then change the code
                combination = newCode;

                System.out.println(
                    "Code changed successfully"
                );

            } else {

                System.out.println(
                    "Code change rejected: wrong current code"
                );
            }
        }

        // We intentionally DO NOT create
        // getCombination().
    }

    public static void main(String[] args) {

        Locker l =
            new Locker(
                101,
                "1234"
            );

        // Correct old code
        l.changeCode(
            "1234",
            "5678"
        );

        // Wrong old code
        l.changeCode(
            "0000",
            "9999"
        );
    }
}
