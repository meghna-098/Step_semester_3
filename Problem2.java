public class Problem2 {

    static String findDuplicatePick(
            String[] playerNames) {

        // Outer loop selects the first player
        for (int i = 0;
             i < playerNames.length;
             i++) {

            // Inner loop checks players after i
            for (int j = i + 1;
                 j < playerNames.length;
                 j++) {

                // Compare the two names
                if (playerNames[i].equals(playerNames[j])) {

                    // Duplicate found
                    return "Duplicate Found: "
                            + playerNames[i];
                }
            }
        }

        // No duplicate was found
        return "No Duplicates Found";
    }

    public static void main(String[] args) {

        String[] playerNames = {
            "Kohli",
            "Bumrah",
            "Kohli",
            "Rohit"
        };

        String result =
            findDuplicatePick(playerNames);

        System.out.println(result);
    }
}
