//Program to give the time until dinner
//Timer.java

import java.util.Scanner;

public class Timer {

    public static void main(String [] args){
        
        //create scanner for user input
        Scanner TIME = new Scanner(System.in);
        
        //enters current time
        System.out.print("Current time:"); 
            int timeCurrent = TIME.nextInt ();
            
        //user enters dinner time
        System.out.print("Dinner time:");
            int timeDinner = TIME.nextInt ();
            
        //computes hours until dinner
        int timeUntilHours = (timeDinner - timeCurrent) / 100;
        
        //finds minute remainder to be displayed
        int timeUntilMinutes = (timeDinner - timeCurrent) % 100;
        
        //information is displayed
        System.out.println ("You have " + timeUntilHours + " hours and " + timeUntilMinutes + " minutes until dinner.");
        
        
    }
}