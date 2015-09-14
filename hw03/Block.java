//Program to calculate the volume and surface area of a block
// Block.java
import java.util.Scanner;

public class Block {
    
    public static void main(String [] args){
    //create a scanenr so the user can input values
    Scanner DIMENSIONS   = new Scanner(System.in);
    
    //user enters first value
    System.out.print("Height of block:");
        float h = DIMENSIONS.nextFloat ();
    //user enteres second value    
    System.out.print("Width of block:");
        float w = DIMENSIONS.nextFloat ();
    //third value    
    System.out.print("Length of block:");
        float l = DIMENSIONS.nextFloat();
        
    //program calculates volume
    float volume = l *  w * h;
    
    //program calculates surface area
    float SA = (2*(l * w)) + (2*(w * h)) + (2*(h * l));
    
    
    //values are printed for the user to read
    System.out.println("Volume:" + volume);
    System.out.println("Surface Area:" + SA);
    }

}