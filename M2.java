public class M2 {

    static class PayrollAccount {

        // Private fields
        private double basicSalary;
        private double bonus;

        // Constructor
        public PayrollAccount(double openingSalary) {

            if (openingSalary < 0) {

                System.out.println(
                    "Warning: Negative basic salary. "
                    + "Starting at Rs 0.0"
                );

                basicSalary = 0;

            } else {

                basicSalary = openingSalary;
            }

            // Bonus starts at zero
            bonus = 0;
        }

        // Add bonus
        public void creditBonus(double amount) {

            if (amount <= 0) {

                System.out.println(
                    "Bonus rejected: amount must be positive"
                );

            } else {

                bonus += amount;

                System.out.println(
                    "Bonus credited: Rs "
                    + amount
                );
            }
        }

        // Deduct tax
        public void deductTax(double percent) {

            if (percent < 0 || percent > 100) {

                System.out.println(
                    "Tax rejected: percent must be "
                    + "between 0 and 100"
                );

            } else {

                basicSalary =
                    basicSalary
                    - (basicSalary * percent / 100);

                System.out.println(
                    "Tax deducted: "
                    + percent + "%"
                );
            }
        }

        // Getter
        public double getNetSalary() {

            return basicSalary + bonus;
        }
    }

    public static void main(String[] args) {

        // Opening salary
        PayrollAccount account =
            new PayrollAccount(50000);

        // Add bonus
        account.creditBonus(5000);

        // Deduct 10% tax
        account.deductTax(10);

        // Display final salary
        System.out.println(
            "Net salary: Rs "
            + account.getNetSalary()
        );
    }
}
