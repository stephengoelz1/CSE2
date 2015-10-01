//program to compute total payroll to be paid to employees
import java.util.Scanner;

public class payroll {
    public static void main(String [] args){
         Scanner numEmployees = new Scanner(System.in);
         Scanner PAYRATE = new Scanner(System.in);
         Scanner MONDAY = new Scanner(System.in);
         Scanner TUESDAY = new Scanner(System.in);
         Scanner WEDNESDAY = new Scanner(System.in);
         Scanner THURSDAY = new Scanner(System.in);
         Scanner FRIDAY = new Scanner(System.in);
         
         System.out.println("How many employees do you need to pay");
         int toBePaid = numEmployees.nextInt();
         int counter = 0;
         int empNum = 1;
         int payRate = 0;
         int monday = 0;
         int tuesday = 0;
         int wednesday  = 0;
         int thursday = 0;
         int friday = 0;
         int totalHours = 0;
         double totalPay = 0;
         while(toBePaid > counter){
             System.out.println("How much does employee " + empNum + " get paid in cents");
             payRate = PAYRATE.nextInt();
             System.out.println("How many hours did employee " + empNum + " work on Monday");
             monday = MONDAY.nextInt();
             System.out.println("How many hours did employee " + empNum + " work on Tuesday");
             tuesday = TUESDAY.nextInt();
             System.out.println("How many hours did employee " + empNum + " work on Wednesday");
             wednesday = WEDNESDAY.nextInt();
             System.out.println("How many hours did employee " + empNum + " work on Thursday");
             thursday = THURSDAY.nextInt();
             System.out.println("How many hours did employee " + empNum + " work on Friday");
             friday = FRIDAY.nextInt();
             
             totalHours = (monday + tuesday + wednesday + thursday + friday);
             totalPay = totalPay + (totalHours*payRate);
             empNum++;
             counter++;
         }
         double dollars = (totalPay/100);
         System.out.println("Total amount to be paid out is: $" + dollars);
    }
}