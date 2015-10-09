//smallest of 3 numbers

import java.util.Scanner;
public class tester2 {
    public static void main(String [] args){
        Scanner PSIZE = new Scanner(System.in);
        
        double size =9; 
        int counter = 1;
        int numNums = 9; 
        while(size >= counter)
        {
            for(int n = 1 ; n < size; n++){
                System.out.print( "  " + n + "  ");
            }
            for(int h = numNums; h > 0; h--){
                System.out.print(h);
                System.out.print("  ");
            }
            counter++;
            System.out.println();
            System.out.println();
        }
}
}