// Program to calculate how to divide a check and how much to pay
// check.java

import java.util.Scanner;

public class check {
        
        public static void main(String[] args){
            
            Scanner CheckCounter = new Scanner(System.in);
            
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
                double CheckCost = CheckCounter.nextDouble ();
            
            System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
                double TipPercent =CheckCounter.nextDouble();
                TipPercent /= 100; //converts tip into a percentage 
        
            System.out.print("Enter the number of people who went out to dinner:");
                int numPeople = CheckCounter.nextInt ();
        
            double totalCost;
            double costPerPerson;
            int dollars, //whole dollar amount of cost
                dimes, pennies; //for values to the right of the decimal
                
            totalCost= CheckCost * (1 + TipPercent);
            costPerPerson = totalCost / numPeople;
            //get the whole amount dropping decimal fraction
            dollars = (int) costPerPerson;
            //get dimes amount
            //int (6.73 * 10) % 10 -> 67 % 10 -> 7
            // where the % (mod) operator returns the remainder after the division
            dimes=(int) (costPerPerson * 10) % 10;
            pennies=(int) (costPerPerson * 100) % 10;
            System.out.println("Each person in the group owes $" + dollars + "." + dimes +pennies);
        }
}