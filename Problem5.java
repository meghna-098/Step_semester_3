
import java.util.Arrays;

public class Problem5 {

    static class Candidate
            implements Comparable<Candidate> {

        // Private fields for encapsulation
        private String name;
        private double cgpa;
        private int codingScore;

        // Constructor
        public Candidate(
                String name,
                double cgpa,
                int codingScore) {

            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        // ------------------------------------------------
        // Eligibility Method 1
        // CGPA-only check
        // ------------------------------------------------
        static boolean isEligible(double cgpa) {

            return cgpa >= 7.5;
        }

        // ------------------------------------------------
        // Eligibility Method 2
        // CGPA + Coding Score check
        // ------------------------------------------------
        static boolean isEligible(
                double cgpa,
                int codingScore) {

            return cgpa >= 6.5
                    && cgpa < 7.5
                    && codingScore >= 60;
        }

        // ------------------------------------------------
        // Calculate composite score
        // ------------------------------------------------
        double getCompositeScore() {

            return cgpa * 10
                    + codingScore * 0.5;
        }

        // ------------------------------------------------
        // Check whether this candidate is eligible
        // ------------------------------------------------
        boolean isEligible() {

            // Candidate can qualify through either rule
            return isEligible(cgpa)
                    || isEligible(cgpa, codingScore);
        }

        // ------------------------------------------------
        // compareTo for descending order
        // ------------------------------------------------
        @Override
        public int compareTo(Candidate other) {

            return Double.compare(
                    other.getCompositeScore(),
                    this.getCompositeScore()
            );
        }

        // ------------------------------------------------
        // Getter for name
        // ------------------------------------------------
        public String getName() {

            return name;
        }
    }

    // ----------------------------------------------------
    // Shortlist and rank candidates
    // ----------------------------------------------------
    static String shortlistAndRank(
            Candidate[] candidates) {

        // -----------------------------------------------
        // Step 1: Count eligible candidates
        // -----------------------------------------------

        int count = 0;

        for (Candidate candidate : candidates) {

            if (candidate.isEligible()) {
                count++;
            }
        }

        // -----------------------------------------------
        // Step 2: Create array of correct size
        // -----------------------------------------------

        Candidate[] shortlisted =
                new Candidate[count];

        // -----------------------------------------------
        // Step 3: Put eligible candidates into array
        // -----------------------------------------------

        int index = 0;

        for (Candidate candidate : candidates) {

            if (candidate.isEligible()) {

                shortlisted[index] = candidate;
                index++;
            }
        }

        // -----------------------------------------------
        // Step 4: Sort candidates
        // -----------------------------------------------

        Arrays.sort(shortlisted);

        // -----------------------------------------------
        // Step 5: Build final output
        // -----------------------------------------------

        StringBuilder result =
                new StringBuilder();

        for (int i = 0;
             i < shortlisted.length;
             i++) {

            // Add separator between candidates
            if (i > 0) {
                result.append(" | ");
            }

            result.append(i + 1)
                  .append(". ")
                  .append(shortlisted[i].getName())
                  .append(" (")
                  .append(shortlisted[i].getCompositeScore())
                  .append(")");
        }

        return result.toString();
    }

    // ----------------------------------------------------
    // Main method
    // ----------------------------------------------------
    public static void main(String[] args) {

        Candidate[] candidates = {

            new Candidate(
                    "Aisha",
                    8.2,
                    40
            ),

            new Candidate(
                    "Rohit",
                    6.8,
                    65
            ),

            new Candidate(
                    "Meena",
                    6.0,
                    90
            ),

            new Candidate(
                    "Karan",
                    7.5,
                    20
            )
        };

        String result =
                shortlistAndRank(candidates);

        System.out.println(result);
    }
}
