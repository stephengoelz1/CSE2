//Stephen Goelz
// Program to print out a pyramid with height specified by user

import java.util.Scanner;


public class pyramid {
    public static void main(String [] args){
        Scanner PSIZE = new Scanner(System.in);
        
        System.out.println("How big do you want the pyramid to be?");
        double size = PSIZE.nextDouble(); //size of pyramid is set
        int counter = 1; //indicates starting at the first line
        int numStars = 1; //indicates that one star will be printed for the first run
        while(size >= counter){
            
            //inserts the correct number of spaces so the top star will be set in the center of the pyramid
            // counter keeps track of what line the program is currently running.
            for(int n = counter ; n < size; n++){
                System.out.print(" ");
            }
            //prints out a number of stars starting with one and increasing by 2
            //each time the for loop runs it prints another star until h reaches 0
            for(int h = numStars; h > 0; h--){
                System.out.print("*");
            }
            counter++;
            numStars = numStars + 2; //since the number of stars in each line is an odd number we must increase by 2 every time the loop restarts
            System.out.println(); //pushes the program to the next line before starting to print out the next set of stars
        }
    }
}