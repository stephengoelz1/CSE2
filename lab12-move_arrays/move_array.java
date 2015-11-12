//Stephen Goelz
//modify arrays by shifting a selected index to the last index

import java.util.Scanner; //imports scanner

public class move_array { //names class

	public static void main(String[] args) { //main method
		
	    Scanner INDEX = new Scanner(System.in); //creates scanner
	    int[] array; //creates a new array but does not tell how large it is
	    System.out.println("How big should the array be?"); //prompts the user for input
	    int n = INDEX.nextInt(); //creates a variable that will be used 
	    try{ //begin try statement
	    	while(n > 100 || n < 0){ //the program checks the value of n to be a valid input
	    		System.out.println("Please enter a valid size"); //prompts the user for a new value
	    		n = INDEX.nextInt(); //user gives new value
	    	}
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	    	while(n < 100 && n > 0){ //if the value is a valid input the program continues
	    		break;
	    	}
	    }
	    array = new int[n]; //array's size becomes n
	    for(int i = 0; i < array.length; i++){ // fills array with random values
	    	array[i] = (int)(Math.random()*100);
	    }
	    for(int i = 0; i<array.length;i++){ //prints the initial array to be compared to the modified array
	    	System.out.print(array[i] + " "); 
	    }
	    System.out.println("Which index would you like to move to the end of the array?"); //asks the user to choose which index gets moved
	    int choice = INDEX.nextInt(); //user makes their selection
	    try{ //begin try statement
	    	while(choice > array.length-1 || choice < 0){ //checks the validity of the user's choice
	    		System.out.print("Enter a valid choice"); //prompts user for a new choice
		    	choice = INDEX.nextInt(); //user enters new choice
	    	}
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	    	while(choice < array.length-1 || choice >= 0){ //if the choice is valid the program continues
	    		break;
	    	}
	    }
	    int temp = 0; //temp variable is created in order to shift value chosen
	    for(int i = choice; i <array.length-1; i++){ //for loop to move through array
	    	if(i<array.length-1){ //if the chosen index is not the last one it continues to move spaces
	    		temp =array[i]; //the next 3 steps swap the values of the adjacent indices
	    		array[i]=array[i+1];
	    		array[i+1] = temp;
	    	}
	    }
	    for(int i = 0; i < array.length; i++){ //prints out modified array
	    	System.out.print(array[i]+ " ");
	    }
	}

}
