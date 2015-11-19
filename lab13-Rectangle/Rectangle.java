//Stephen Goelz
//non-static methods to compute area

public class Rectangle { //creates public class
	double width = 0 ; //create  global variables to be used
	double height = 0 ;
	public void setWidth(double x){ //class that assigns a value to width
		width = x;
	}
	public void setHeight(double y){ //assigns value to height
		height = y;
	}
	public double getArea(){ //class computes the area based on values entered in the main method
		double area = height * width ;
		return area; //returns the calculated area 
	}
	public static void main(String[] args) { //main method
		Rectangle r1 = new Rectangle(); //creates object to access information in the rectangle class
		r1.setHeight(5.3); //assigns value of 5.3 to the height variable
		r1.setWidth(7.3); //assigns value of 7.3 to width variable 
		System.out.println(r1.getArea()); //computes and prints out the area based on entered parameters
	}
}
