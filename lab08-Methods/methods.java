// program to calculate the mean, median and prints them out for 10 numbers
import java.util.Scanner; //imports scanner untility

public class methods {
    
    
    public static double mean (double num1, double num2, double num3, double num4, double num5, double num6, double num7, double num8, double num9, double num10) 
    {
   
        
        double avg = ((num1 + num2 + num3 + num4 + num5 + num6 + num7 +num8 + num9 + num10) / 10 ); //calcultes the average of the set of integers entered by the user
        return avg; //says what the class will return when called in the main method
    }
    public static double median (double num5, double num6) {
        double Median = ((num5 + num6)/2);
        return Median;
    }
    public static void main (String [] args) {
        Scanner INTS = new Scanner(System.in);
        System.out.println("Enter your 10 digits from least to greatest.");
        double num1 = INTS.nextDouble();  //user enters first #
        double num2 = INTS.nextDouble();  //user enters second #
        while(num2 < num1){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num2 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        double num3 = INTS.nextDouble();  //user enters third #
        while(num3 < num2 ){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num3 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        double num4 = INTS.nextDouble();  //user enters fourth #
        while(num4 < num3 ){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num4 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        double num5 = INTS.nextDouble();  //user enters fifth #
        while(num5 < num4){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num5 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        double num6 = INTS.nextDouble();  //user enters sixth #
        while(num6 < num5){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num6 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        double num7 = INTS.nextDouble();  //user enters seventh #
        while(num7 < num6){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num7 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        double num8 = INTS.nextDouble();  //user enters eighth #
        while(num8 < num7){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num8 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        double num9 = INTS.nextDouble();  //user enters ninth #
        while(num9 < num8){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num9 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        double num10 = INTS.nextDouble(); //user enters tenth #
        while(num10 < num9){
            //verifies that input is greater than the last
            System.out.println("Enter a valid input.");
            num10 = INTS.nextDouble(); //if the input is not a valid input this line reassigns the problem integer
        }
        
        ;
        System.out.println("Mean: " + mean(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10)); //calls and prints the method that calculates the mean value of the set of numbers
        System.out.println("Median: " + median(num5, num6)); //calls and prints the method that calculates the median value of the set of numbers
    }
    
    
}