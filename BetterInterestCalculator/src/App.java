import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        BetterInterestCalculator calculator = new BetterInterestCalculator();
        BetterLuckySevens luckySevens = new BetterLuckySevens();
        BetterRockPaperScissors rockPaperScissors = new BetterRockPaperScissors();

        System.out.println("Which project would you like to run? \n1-Interest Calculator\n2-Lucky Sevens\n3-Rock Paper Scissors");
        int response = myScanner.nextInt();

        switch (response) {
            case 1:
            default:
                System.out.println("Inside case 1:");
                calculator.startCalculator();
                break;
            case 2:
                System.out.println("Inside case 2:");
                luckySevens.startLuckySevens();
                break;
            case 3:
                System.out.println("Inside case 3:");
                rockPaperScissors.startRockPaperScissors();
                break;

        }
    }
}
