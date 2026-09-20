import java.util.Arrays;

public class Problem5 {

    // ==================================================
    // PLAYER CLASS
    // ==================================================

    static class Player
            implements Comparable<Player> {

        // ----------------------------------------------
        // Private fields
        // ----------------------------------------------

        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        // ----------------------------------------------
        // Constructor
        // ----------------------------------------------

        public Player(
                String name,
                int matchesPlayed,
                double battingAverage,
                boolean injured) {

            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        // ----------------------------------------------
        // Overloaded method 1
        // Established-player rule
        // ----------------------------------------------

        static boolean isDraftable(
                int matchesPlayed) {

            return matchesPlayed >= 10;
        }

        // ----------------------------------------------
        // Overloaded method 2
        // Combined experience + fitness rule
        // ----------------------------------------------

        static boolean isDraftable(
                int matchesPlayed,
                boolean injured) {

            return matchesPlayed >= 5
                    && !injured;
        }

        // ----------------------------------------------
        // Check this particular player's eligibility
        // ----------------------------------------------

        boolean isDraftable() {

            // Established players qualify through
            // the experience-only rule.
            if (isDraftable(matchesPlayed)) {
                return true;
            }

            // Other players must satisfy the
            // combined rule.
            return isDraftable(
                    matchesPlayed,
                    injured
            );
        }

        // ----------------------------------------------
        // compareTo()
        // ----------------------------------------------

        @Override
        public int compareTo(Player other) {

            // Higher batting average should come first.
            return Double.compare(
                    other.battingAverage,
                    this.battingAverage
            );
        }

        // ----------------------------------------------
        // Getter for name
        // ----------------------------------------------

        public String getName() {
            return name;
        }
    }

    // ==================================================
    // DRAFT AND RANK METHOD
    // ==================================================

    static String draftAndRank(Player[] players) {

        // ----------------------------------------------
        // Step 1: Count draftable players
        // ----------------------------------------------

        int count = 0;

        for (Player player : players) {

            if (player.isDraftable()) {
                count++;
            }
        }

        // ----------------------------------------------
        // Step 2: Create array for draftable players
        // ----------------------------------------------

        Player[] draftable =
                new Player[count];

        // ----------------------------------------------
        // Step 3: Copy eligible players
        // ----------------------------------------------

        int index = 0;

        for (Player player : players) {

            if (player.isDraftable()) {

                draftable[index] = player;

                index++;
            }
        }

        // ----------------------------------------------
        // Step 4: Sort using compareTo()
        // ----------------------------------------------

        Arrays.sort(draftable);

        // ----------------------------------------------
        // Step 5: Build output
        // ----------------------------------------------

        StringBuilder result =
                new StringBuilder();

        for (int i = 0;
             i < draftable.length;
             i++) {

            // Add separator after first player
            if (i > 0) {
                result.append(" | ");
            }

            result.append(i + 1)
                  .append(". ")
                  .append(draftable[i].getName());
        }

        return result.toString();
    }

    // ==================================================
    // MAIN METHOD
    // ==================================================

    public static void main(String[] args) {

        Player[] players = {

            new Player(
                "Virat",
                15,
                48.0,
                false
            ),

            new Player(
                "Rahul",
                7,
                55.0,
                false
            ),

            new Player(
                "Sameer",
                3,
                60.0,
                false
            ),

            new Player(
                "Dev",
                12,
                20.0,
                true
            )
        };

        String result =
                draftAndRank(players);

        System.out.println(result);
    }
}
