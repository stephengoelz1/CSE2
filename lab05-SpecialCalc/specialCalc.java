//program to omplete basic math operations

//import scanner so users can input their own data
import java.util.Scanner;

public class specialCalc {
        
        public static void main(String [] args) {
            
            //name scanners
            
            
            
            System.out.println("Would you like to calculate some numbers?");
            
                 Scanner YorN = new Scanner(System.in);
            
            String r = YorN.next();
            
            while (r.equals("Y") || r.equals("Yes")){
                 Scanner CALC = new Scanner(System.in);
                
            //entering all variables and operators
            System.out.print("Enter your first value.");
                double f = CALC.nextDouble();
                
            System.out.print("Enter your second value.");
                double b = CALC.nextDouble();
            
            System.out.print("Enter your operator.");
                String g = CALC.next();
            double c = 0;
            //declaring possible combinations of operations
            switch (g) {
                case "/":
                     c = (f/b);
                    break;
                    
                case "*" :
                     c = (f*b);
                    break;
                    
                case "+":
                    c = (f+b);
                    break;
                    
                case "-":
                  c = (f-b);
                    break;
                    
                default : System.out.println("illegal operator");
                    break;
               
            }
                
                System.out.println (c);
                System.out.println("Would you like to keep calculating?");
                
            
             r = YorN.next();
                
            }
        }
}