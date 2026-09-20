public class Problem3 {

    static class NameTag {

        // Final fields
        private final String firstName;
        private final String lastName;

        // Constructor
        public NameTag(String fullName) {

            // Split the full name
            String[] parts =
                fullName.split(" ");

            // Store first name
            this.firstName = parts[0];

            // Store last name
            this.lastName = parts[1];
        }

        // Return nickname
        public String getNickname() {

            return firstName
                + " "
                + lastName.charAt(0)
                + ".";
        }
    }

    public static void main(String[] args) {

        NameTag tag =
            new NameTag("Maria Gomez");

        System.out.println(
            tag.getNickname()
        );
    }
}
