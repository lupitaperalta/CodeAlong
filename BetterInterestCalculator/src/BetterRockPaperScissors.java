import java.util.Random;
import java.util.Scanner;

public class BetterRockPaperScissors {
    public void startRockPaperScissors() {
        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();

        int maxRounds = 10;
        int minRounds = 1;
        int ties = 0;
        int userWins = 0;
        int computerWins = 0;

        String playAgain = "Yes";

        while (playAgain.equalsIgnoreCase("Yes")) {
            System.out.println("How many rounds do you want to play? (1-10): ");
            int rounds = myScanner.nextInt();

            if (rounds < minRounds || rounds > maxRounds) {
                System.out.println("Invalid number of rounds. Exiting the program.");
                System.exit(0);
            }
            for (int i = 1; i <= rounds; i++) {
                System.out.println("---- Round " + i + " ----");
                System.out.println("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
                int userChoice = myScanner.nextInt();
                int computerChoice = randomizer.nextInt(3) + 1;

                System.out.println("Computer's choice: " + computerChoice);

                if (userChoice == computerChoice) {
                    System.out.println("It's a tie!");
                    ties++;
                } else if ((userChoice == 1 && computerChoice == 3) ||
                        (userChoice == 2 && computerChoice == 1) ||
                        (userChoice == 3 && computerChoice == 2)) {
                    System.out.println("You win!");
                    userWins++;
                } else if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Invalid choice. Exiting program.");
                    System.exit(0);
                } else {
                    System.out.println("Computer wins!");
                    computerWins++;
                }

                System.out.println();
            }
            System.out.println("---- Round Results ----");
            System.out.println("Ties: " + ties);
            System.out.println("Your wins: " + userWins);
            System.out.println("Computer wins: " + computerWins);

            if (userWins > computerWins) {
                System.out.println("Congratulations! You are the winner!");
            } else if (userWins < computerWins) {
                System.out.println("Computer is the winner!");
            } else {
                System.out.println("It's a tie!");
            }
            System.out.println();
            System.out.println("Do you want to play again? (Yes/No): ");
            playAgain = myScanner.next();
            System.out.println();
        }
        System.out.println("Thanks for playing!");
    }
}
