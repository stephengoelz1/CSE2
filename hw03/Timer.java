//Program to give the time until dinner
//Timer.java

import java.util.Scanner;

public class Timer {

    public static void main(String [] args){
        
        Scanner TIME = new Scanner(System.in);
        
        System.out.print("Current time:"); 
            int timeCurrent = TIME.nextInt ();
            
        System.out.print("Dinner time:");
            int timeDinner = TIME.nextInt ();
            
        int timeUntilHours = (timeDinner - timeCurrent) / 100;
        int timeUntilMinutes = (timeDinner - timeCurrent) % 100;
        System.out.println ("You have " + timeUntilHours + " hours and " + timeUntilMinutes + " minutes until dinner.");
        
        
    }
}