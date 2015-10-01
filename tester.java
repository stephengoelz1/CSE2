//smallest of 3 numbers

import java.util.Scanner;
public class tester {
        
        
        public static void main(String [] args) {
            Scanner PRINCIPAL = new Scanner(System.in);
            Scanner INTEREST = new Scanner(System.in);
            Scanner YEARS = new Scanner(System.in);
            
            System.out.println("Enter your principal:");
            int principal = PRINCIPAL.nextInt();
            
            System.out.println("Enter your interest rate as a decimal:");
            double interest = INTEREST.nextDouble();
            
            System.out.println("Number of years:");
            int years= YEARS.nextInt();
            
            double total = principal;
            int counter = 0;
            
            while (counter < years){
            total=total + (total * interest);
            
            counter++;
            }
            System.out.println("Total: " + total);
        } 
}
            
            
            
            
            