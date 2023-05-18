import java.util.Scanner;

public class BetterInterestCalculator {
    public double invest;
    public double annualInterestRate;
    public int numOfYears;
    public void startCalculator() {
        userInputs();

        System.out.println("\nCalculating...");

        //declare and initialize variables
        double currentBalance = invest;
        double interestEarned;
        double quarterlyInterestRate = annualInterestRate / 4;

        //use first loop to iterate through number of years
        //second loop to iterate through each quarter of that year
        for (int year = 1; year <= numOfYears; year++) {
            for (int quarter = 0; quarter < 4; quarter++) {
                currentBalance = currentBalance * (1 + (quarterlyInterestRate / 100));
            }

            //compare the current balance by the investment value
            interestEarned = currentBalance - invest;

            System.out.println("Year " + year + ":");
            System.out.println("Began with $" + String.format("%.2f", invest));
            System.out.println("Earned $" + String.format("%.2f", interestEarned));
            System.out.println("Ended with $" + String.format("%.2f", currentBalance) + "\n");

            invest = currentBalance;
        }
    }
    private void userInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much do you want to invest? $");
        invest = scanner.nextDouble();

        System.out.print("How many years are you investing? ");
        numOfYears = scanner.nextInt();

        System.out.print("What is the annual interest rate % growth? ");
        annualInterestRate = scanner.nextDouble();

    }
}
