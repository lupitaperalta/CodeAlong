/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wileyedgeka.interestcalculator;

/**
 *
 * @author Korinna
 */


import java.util.Scanner;
        
public class InterestCalculator {

    public static void main(String[] args) {
        
        //Declare Variables
        float amountToInvest;
        int yearsToInvent;
        float annualInterestRate;
        
        float quarterlyInterestRate;
        
        float principalBeg;
        float earnedInterest;
        float principalEnd;
        
        //Declare and Initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
               
        //Prompts & Inputs
        System.out.println("How much do you want to invest?");
        amountToInvest = myScanner.nextInt();
        
        System.out.println("How many years are investing?");
        yearsToInvent = myScanner.nextInt();
        
        System.out.println("What is the annual interest rate % growth?");
        annualInterestRate = myScanner.nextInt();
        
        //Sets up the calculations
        principalBeg = amountToInvest;
        quarterlyInterestRate = annualInterestRate / 4;
        
       // For Loop that prints calculations for each year 
        for (int yearNumber = 1; yearNumber <= yearsToInvent; yearNumber++ ) {
            
            //Inner For Loop that calculates quaterly interest
            for (int quarterly = 0; quarterly < 4; quarterly++){
                principalBeg = (principalBeg * (1 + quarterlyInterestRate/100));
            }
                 
         //Calculations for Earned Interest and Ending Principal for the year 
         earnedInterest = principalBeg - amountToInvest;
         principalEnd = amountToInvest + earnedInterest;
                 
                 
          System.out.println("Year: " + yearNumber);
          System.out.printf("Began with: $ %.2f %n", amountToInvest);
          System.out.printf("Earned: $ %.2f %n", earnedInterest);
          System.out.printf("End with: $ %.2f %n", principalEnd);
          System.out.println("______________ \n");

          amountToInvest = principalEnd;
          
        }
       
        
    }
}
