/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_11;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class Loan {

    public static void main(String[] args) {
//        creating the Scanner object so that we can read the input values        
        Scanner sc = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        int loanAmount = sc.nextInt();
        System.out.print("Number of Years: ");
        int years = sc.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interest_Rate = sc.nextDouble();
//       claculating the  monthly_interest_rate
        double monthly_interest_rate = interest_Rate/(12*100);
//        calculating the monthly_Payment
        double monthly_Payment = loanAmount * monthly_interest_rate / 
                (1-(Math.pow(1/ (1 + monthly_interest_rate),years * 12)));
        System.out.println("Monthly Payment: " +String.format("%.2f",
                monthly_Payment) +"\n");
        System.out.println("Total Payment: " +String.format("%.2f",
                (monthly_Payment *12 * years)) +"\n");
        System.out.println("Payment#"+"\t"+"\t"+"Interest"+"\t"+"\t"+"Principal"
                +"\t"+"Balance");
        
        double balance = loanAmount;
        double interest;
        double principal;
        for(int i=1;i<=years*12;i++){
            interest = (int)(monthly_interest_rate*balance*100)/100.0;
            principal = (int)((monthly_Payment - interest)*100)/100.0;
            balance = balance-principal;
            System.out.println(i+"\t"+"\t"+String.format("%.2f", interest)
                    +"\t"+"\t"
                    +String.format("%.2f", principal)+"\t"+"\t"
                    +String.format("%.2f", balance));
        }        
    }    
}
