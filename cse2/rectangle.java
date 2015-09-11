// Area of Rectangle
// area.java
import java.util.Scanner;

public class rectangle {
    
    public static void main(String[] args){
        
        Scanner INPUTSCANNER = new Scanner(System.in);
        
        
        System.out.print("Type the width");
        float width = INPUTSCANNER.nextInt();
        System.out.print("Type the height");
        float height = INPUTSCANNER.nextInt();
        float area = width * height ;
        System.out.println("Area " + area);
    }
}

    
    