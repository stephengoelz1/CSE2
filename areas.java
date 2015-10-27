//Stephen Goelz
//compute the area of 3 different shapes
import java.util.Scanner; //imports scanner object
public class areas {

	
	public static double area(double radius){ //method to compute the area of a circle
	double pi = Math.PI; //calls the stored value of pi and assigns that value to a variable pi
	double area = (pi*(radius*radius));  //computes the area using the formula PIr^2
	return area; // returns the area of the circle
	}
	public static double area(double length, double width){ // method to calculate the area of a rectangle with given arguments of height and width
		double area = length*width; //computes area
		return area; //returns area
	}
	public static double area(double height, double base1, double base2){ // method to calculate area of trapezoid
		double area = (height*((base1 + base2)/2)); //calculates area using the formula ((base1 + base2)/2 * height)
		return area; //returns area
	}
	public static void main(String[] args) {
	
	Scanner SHAPE = new Scanner(System.in); //creates a scanner that allows the to select the shape and then enter the needed values
	while(true){//makes the program continue running until the user enters 100
	System.out.println("What type of shape are you interested in? 1-Circle 2-Rectangle 3-Trapezoid."); //prompts the user to make a selection 
	int shapeChoice = SHAPE.nextInt(); //user makes the selection
	while((shapeChoice > 3 || shapeChoice < 1) && shapeChoice != 100){ //checks that the choice made by the user is a valid selection
		System.out.println("Please enter a valid input"); //if the user entered an invalid selection it prompts them for a new value
		shapeChoice = SHAPE.nextInt(); //user enters a new selection
	}
	if(shapeChoice == 100){
		break;
	}
	if(shapeChoice == 1 || shapeChoice == 2 || shapeChoice == 3){ // when an acceptable selection has been made, the program enters this if statement and then selects which method to call based on the selection
	if(shapeChoice == 1){ //if 1 was selected then the program executes this if statement which prompts the user for the radius of a circle and calls the appropriate method to calulate the area
		System.out.println("What is the radius of the circle?"); //asks the user for the radius
		double radius = SHAPE.nextDouble(); //user enters the radius
		System.out.println("Area of the circle is " + area(radius)); //the radius is printed out
	}
	if(shapeChoice == 2){ //if the user selected a rectangle then the program enters this if statement 
		System.out.println("Please enter the height and width of the rectangle."); //asks the user for the height and width
		double height = SHAPE.nextDouble(); //user enters height
		double width = SHAPE.nextDouble(); //user enters the width
		System.out.println("The area of the rectangle is " + area(height, width)); //the area is printed out
	}
	if(shapeChoice == 3){ // if the user selects a trapezoid this if statement is entered
		System.out.println("Please enter the height of the trapezoid"); //asks the user for the height of the trapezoid
		double height = SHAPE.nextDouble(); //user enters the height
		System.out.println("Please enter the length of base 1 and base 2 of the trapezoid"); //asks the user to enter the lengths of base1 and base2
		double base1 = SHAPE.nextDouble(); //user enters the length of base1
		double base2 = SHAPE.nextDouble(); //user enters the length of base2
		System.out.println("The area of the trapezoid is " + area(height, base1, base2)); //prints out the area
	}
	}
	}
	}
}
