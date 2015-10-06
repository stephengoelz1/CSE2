
import java.util.Scanner;


public class pyramid {
    public static void main(String [] args){
        Scanner PSIZE = new Scanner(System.in);
        
        System.out.println("How big do you want the pyramid to be?");
        double size = PSIZE.nextDouble();
        int counter = 1;
        int numStars = 1;
        while(size >= counter){
            
            for(int n = counter ; n < size; n++){
                System.out.print(" ");
            }
            for(int h = numStars; h > 0; h--){
                System.out.print("*");
            }
            counter++;
            numStars = numStars + 2;
            System.out.println();
        }
    }
}