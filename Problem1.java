public class Problem1 {

    static class PiggyBank {

        // Savings cannot be accessed directly
        private double savings;

        // ID can be assigned only once
        private final String id;

        // Constructor
        public PiggyBank(String id) {

            this.id = id;
            this.savings = 0;
        }

        // Deposit money
        public void deposit(double amount) {

            if (amount > 0) {

                savings += amount;

                System.out.println(
                    "Deposited: " + amount
                );

            } else {

                System.out.println(
                    "Deposit rejected: amount must be positive"
                );
            }
        }

        // Withdraw money
        public void withdraw(double amount) {

            if (amount <= 0) {

                System.out.println(
                    "Withdrawal rejected: amount must be positive"
                );

            } else if (amount > savings) {

                System.out.println(
                    "Withdrawal rejected: insufficient savings"
                );

            } else {

                savings -= amount;

                System.out.println(
                    "Withdrawn: " + amount
                );
            }
        }

        // Read-only access to savings
        public double getSavings() {

            return savings;
        }

        // Optional getter for ID
        public String getId() {

            return id;
        }
    }

    public static void main(String[] args) {

        PiggyBank pb =
            new PiggyBank("PB-1");

        pb.deposit(100);

        System.out.println(
            "Savings: " + pb.getSavings()
        );

        pb.withdraw(30);

        System.out.println(
            "Savings: " + pb.getSavings()
        );

        pb.withdraw(500);

        System.out.println(
            "Savings: " + pb.getSavings()
        );
    }
}
