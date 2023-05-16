/*
 * Interest calculator program
 *
 */

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        //Declare & Initialize variables
        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you want to invest ($)?");
        double principal = Double.parseDouble(scan.next());

        System.out.println("How many years are investing?");
        int years = scan.nextInt();

        System.out.println("What is the annual interest rate % growth? (%):");
        double annualInterest = Double.parseDouble(scan.next());

        System.out.println("Compound type (annually | semianually | quarterly | monthly | daily):");
        String compoundType = scan.next().toLowerCase();

        // Calculate interest rate and compound frequency based on user input
        int compoundFrequency;
        switch(compoundType) {
            case "anually":
                compoundFrequency = 1;
                break;
            case "semianually":
                compoundFrequency = 2;
                break;
            case "monthly":
                compoundFrequency = 12;
                break;
            case "daily":
                compoundFrequency = 365;
                break;
            case "quarterly":
            default:
                compoundFrequency = 4;
                break;
        }

        double interestRate = annualInterest / compoundFrequency ;

        // Calculate and display results for each year
        for(int i = 1; i <= years; i++){
            double currentBalance = principal;

            for(int j = 0; j < compoundFrequency; j++) {
                currentBalance *= (1 + (interestRate / 100));
            }

            double earnings = currentBalance - principal;
            System.out.println("Year " + i);
            System.out.printf("Began with: %.2f%n", principal); // Format to two decimal place
            System.out.printf("Earned: %.2f%n", earnings);
            System.out.printf("Ended up with %.2f%n", currentBalance);

            principal = currentBalance; // Set the principal for the next year
        }
    }
}
