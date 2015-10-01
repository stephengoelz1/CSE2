//smallest of 3 numbers

import java.util.Scanner;
public class tester {
        
        
        public static void main(String [] args) {
            Scanner value = new Scanner(System.in);
            
            int start = 7;
            
            while(start%5 != 0){
                System.out.println("Enter your value: ");
                start = value.nextInt();
            }
        }
}
            