//smallest of 3 numbers

import java.util.Scanner;
public class tester {
        
        
        public static void main(String [] args) {
        double sum = 0;
            for(double n=50000; n>=1; n--){
                sum = sum + (1/n);
                  }
            System.out.println(sum);
        } 
    
}     
            
            
            
            