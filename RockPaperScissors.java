import java.util.*;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[][] results = new String[5][4];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.nextLine();

            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            System.out.println("Computer Move: " + computerMove);
            System.out.println("Result: " + result);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = playerMove;
            results[i][2] = computerMove;
            results[i][3] = result;
        }

        System.out.println("\n----- Final Summary -----");
        System.out.printf("%-8s %-15s %-15s %-18s%n",
                "Round", "Player Move", "Computer Move", "Result");

        for (String[] row : results) {
            System.out.printf("%-8s %-15s %-15s %-18s%n",
                    row[0], row[1], row[2], row[3]);
        }

        double winPercentage = (wins / 5.0) * 100;

        System.out.println("\nWins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.printf("Win %%  : %.1f%%%n", winPercentage);

        sc.close();
    }
}
