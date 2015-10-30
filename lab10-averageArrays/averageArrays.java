//Stephen Goelz
//program to create an array, calculate the sum and average and prints all values greater than the average
import java.util.Scanner; //import scanner object
public class averageArrays { //class name

	public static void main(String[] args) { //main method
		Scanner SIZE = new Scanner(System.in); //creates and names scanner 
		System.out.println("How many numbers do you need to deal with"); //prompts the user to enter the size of the array
		int n = SIZE.nextInt(); //assigns a value to variable "n" that will be used for the size of the array
		int [] values ; //creates the array "values" that consists of integer values
		values = new int[n]; //allocates "n" amount of space to the integer array "values"
		int sum = 0; //creates a variable that will be used to calculate the sum 
		for(int i = 0; i < n; i++){ //steps through each index of the array
			values[i] = (int)(Math.random() * 100); //assigns a random integer value to each index of the array
		}
		for(int i = 0; i < n; i++){ //steps through the array one by one
			System.out.println(values[i]); //prints out each index of the array
		}
		for(int i = 0; i < n; i++){ //steps through each index of the array
			sum = sum + values[i]; //adds the value of each index to the sum
		}
		double average = (sum/n);// calculates the average
		System.out.println("Total= " + sum); //prints out sum
		System.out.println("Average= " + average); //prints out average
		System.out.println("Value greater than or equal to the average: "); //explains that the numbers printed after this line will be greater than the average
		for(int i = 0; i < n; i++){ //steps through every index of the array
			if(values[i] >= average){ //checks if the current index is greater than the average value
				 System.out.println(values[i]);	//prints out the value of the index if it is large than the average
			}
		}
	
	}
}