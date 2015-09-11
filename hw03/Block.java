//Program to calculate the volume and surface area of a block
// Block.java
import java.util.Scanner;

public class Block {
    
    public static void main(String [] args){
    
    Scanner DIMENSIONS   = new Scanner(System.in);
    
    System.out.print("Height of block:");
        float h = DIMENSIONS.nextFloat ();
        
    System.out.print("Width of block:");
        float w = DIMENSIONS.nextFloat ();
        
    System.out.print("Length of block:");
        float l = DIMENSIONS.nextFloat();
        
    float volume = l *  w * h;
    
    float SA = (2*(l * w)) + (2*(w * h)) + (2*(h * l));
    
    System.out.println("Volume:" + volume);
    System.out.println("Surface Area:" + SA);
    }

}