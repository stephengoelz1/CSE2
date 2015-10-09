
public class computePI {
        public static void main(String [] args) {
        double sum = 0;
            for(double n=1; n<=50000; n= (n+4)){
                
                sum = sum + (1/n) - (1/(n+2));
                  
            
        } 
    System.out.println(Math.PI);
    System.out.println(sum);
    }   
}
