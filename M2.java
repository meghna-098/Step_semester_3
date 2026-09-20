public class M2 {

    static class MessWallet {

        // Private field
        private double balance;

        // Constructor
        public MessWallet(double openingBalance) {

            if (openingBalance < 0) {

                System.out.println(
                    "Warning: Negative opening balance. "
                    + "Starting at 0."
                );

                balance = 0;

            } else {

                balance = openingBalance;
            }
        }

        // Add money
        public void topUp(double amount) {

            if (amount <= 0) {

                System.out.println(
                    "Top-up rejected: amount must be positive"
                );

            } else {

                balance += amount;

                System.out.println(
                    "Balance after top-up: "
                    + balance
                );
            }
        }

        // Deduct money
        public void deduct(double amount) {

            if (amount <= 0) {

                System.out.println(
                    "Deduction rejected: amount must be positive"
                );

            } else if (amount > balance) {

                System.out.println(
                    "Deduct rejected: insufficient balance"
                );

            } else {

                balance -= amount;

                System.out.println(
                    "Balance after deduction: "
                    + balance
                );
            }
        }

        // Getter
        public double getBalance() {

            return balance;
        }
    }

    public static void main(String[] args) {

        // Create wallet
        MessWallet wallet =
            new MessWallet(500);

        // Add money
        wallet.topUp(200);

        // Try to deduct more than balance
        wallet.deduct(1000);

        // Read final balance
        System.out.println(
            "Final balance: "
            + wallet.getBalance()
        );
    }
}
