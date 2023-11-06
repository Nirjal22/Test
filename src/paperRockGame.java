import java.util.Scanner;
import java.util.Random;

public class paperRockGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play \"Rock, Paper, Scissors?\"");
        System.out.println("Answer \"yes\" or \"no\"");
        String answer = input.next();

        if (answer.equalsIgnoreCase("yes")) {
            letsPlay(input);
        } else {
            System.out.println("Game Over");
        }
    }

    public static void letsPlay(Scanner input) {
        int cMove;
        int userMove = 0;
        int cScore = 0;
        int pScore = 0;
        int tie = 0;
        int rounds = 0;
        Random r = new Random();

        String answer = "yes"; // Initialize answer variable

        while (answer.equalsIgnoreCase("yes")) {
            cMove = r.nextInt(3) + 1;

            System.out.println("Choose your move!");
            System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
            userMove = input.nextInt();

            while (userMove != 1 && userMove != 2 && userMove != 3) {
                System.out.println("Invalid move. Try again.");
                System.out.println("Enter your move: ");
                userMove = input.nextInt();
            }

            if (userMove == 1) {
                System.out.println("You have chosen Rock!");
            } else if (userMove == 2) {
                System.out.println("You have chosen Paper!");
            } else if (userMove == 3) {
                System.out.println("You have chosen Scissors!");
            }

            if (userMove == cMove) {
                System.out.println("Tie Game!");
                System.out.println("");
                tie++;
                rounds++;
            } else if (cMove == 1 && userMove == 3) {
                System.out.println("Computer chose Rock!");
                System.out.println("Rock beats Scissors!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            } else if (cMove == 1 && userMove == 2) {
                System.out.println("Computer chose Rock!");
                System.out.println("Paper beats Rock!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 2 && userMove == 3) {
                System.out.println("Computer chose Paper!");
                System.out.println("Scissors beats Paper!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 2 && userMove == 1) {
                System.out.println("Computer chose Paper!");
                System.out.println("Paper beats Rock!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            } else if (cMove == 3 && userMove == 1) {
                System.out.println("Computer chose Scissors!");
                System.out.println("Rock beats Scissors!");
                System.out.println("Player Wins!");
                pScore++;
                rounds++;
            } else if (cMove == 3 && userMove == 2) {
                System.out.println("Computer chose Scissors!");
                System.out.println("Scissors beats Paper!");
                System.out.println("Computer Wins!");
                cScore++;
                rounds++;
            }

            System.out.println("Would you like to play again?");
            System.out.println("Answer \"yes\" or \"no\"");
            answer = input.next();
        }

        System.out.println("Here are the final scores after " + rounds + " rounds:");
        System.out.println("You: " + pScore + " Computer: " + cScore + " Ties: " + tie);
    }
}