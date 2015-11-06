//Stephen Goelz
//array sorting using loops and methods

public class sortingArrays {
	public static void sort(int [] array){ // method made to sort a single array
		int n = 0; //temporary variable to store the larger variable so it may be reassigned
		for(int i = array.length-1; 1 < i; i--){ //i acts as a backstop so the program does not continue sorting what has already been sorted
			for( int j = 0; j < i; j++){ //starts and the beginning of the array and moves through
				if(array[j] > array[j+1]){ //compares the current index with the next
					n = array[j]; //assigns the temp variable the value of the current index
				array[j] = array[j+1]; //swaps the values of the second index with the first 
				array[j+1]= n; //assigns the value of index j to j+1
				}
			}
			}
		
		
		for(int i = 0; i < array.length; i++) //this for loop prints the array
		{
			System.out.print(array[i] + " ");
		}
	}
	public static void sort(int [] array, int [] array2){ //exact same as the first sort method but takes 2 arrays
		int n = 0;
		for(int i = array.length-1; 1 < i; i--){
			for( int j = 0; j < i; j++){
				if(array[j] > array[j+1]){
					n = array[j];
				array[j] = array[j+1];
				array[j+1]=n;
				}
			}}
		
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println(" ");
		int h = 0;
		for(int i = array2.length-1; 1 < i; i--){
			for( int j = 0; j < i; j++){
				if(array2[j] > array2[j+1]){
					h = array[j];
				array2[j] = array2[j+1];
				array2[j+1]=h;
				}
			}}

		for(int i = 0; i < array2.length; i++)
		{
			System.out.print(array2[i] + " ");
		}
	}
	public static void main(String[] args) {
		int [] array1 = new int[20]; //creates and allocates space for the first array
		int [] array2 = new int[10]; //creates and allocates space for the second array
		int [] array3 = new int[30]; //creates and allocates space for the third array
		for(int i = 0; i < array1.length; i++){ //fills the first array with random numbers
			array1[i] = (int)(Math.random()*100);
		}
		for(int i = 0; i < array2.length; i++){ //fills the second array with random values
			array2[i] = (int)(Math.random()*100);
		}
		
		sort(array1, array2); //calls the sort method capable of sorting 2 arrays
		for(int i = 0; i < 20; i++){ //this for loop fills the first 20 spaces of the third array with the values of the first array
			array3[i]= array1[i];
		}
		for(int i = 0; i < 10; i++){ //fills the last 10 spots in the third array with the values of the second array
			array3[20+i] = array2[i];
		}
		System.out.println(" "); //inserts a line break
		sort(array3); //calls the method that sorts a single array and sorts array3
		
	}

}
