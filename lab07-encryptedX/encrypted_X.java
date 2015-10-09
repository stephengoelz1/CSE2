//Stephen Goelz
// Program to 
import java.util.Scanner;

public class encrypted_X {
    public static void main (String [] args){
        Scanner SIZE = new Scanner(System.in);
        
        System.out.println("How big would you like the square to be? (1-100)");
        int size = SIZE.nextInt();
        
        if((size < 0) || (size > 100)){
            System.exit(-1);
        }
        else {
            //keeps track of what line the program is currently printing
            for(int lineNum = 1; lineNum < size; lineNum++){
                //keeps track of location within the line
                for(int locationInLine = 1; locationInLine < size; locationInLine++){
                    //prints a spaces at the 2
                    //locations on the line where necessary
                    //if where you are in the row is equal to
                    if((locationInLine==lineNum) || (locationInLine==(size-lineNum))){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }System.out.println();
            }
        }
    }
}