public class Problem3 {

    static class PasswordChecker {

        // Password is private and cannot be changed
        private final String password;

        // Constructor
        public PasswordChecker(String password) {

            this.password = password;
        }

        // Return password strength
        public String getStrength() {

            int length = password.length();

            if (length < 6) {

                return "Weak";

            } else if (length <= 9) {

                return "Medium";

            } else {

                return "Strong";
            }
        }
    }

    public static void main(String[] args) {

        PasswordChecker pc =
            new PasswordChecker("abcd");

        System.out.println(
            "Password strength: "
            + pc.getStrength()
        );

        PasswordChecker pc2 =
            new PasswordChecker("abcdefgh");

        System.out.println(
            "Password strength: "
            + pc2.getStrength()
        );

        PasswordChecker pc3 =
            new PasswordChecker("abcdefghij");

        System.out.println(
            "Password strength: "
            + pc3.getStrength()
        );
    }
}
