//Stephen Goelz
import java.util.Scanner;

public class mineSweeper {

	public static void main(String[] args) {
		
		Scanner BOARD = new Scanner(System.in);
		System.out.println("How big would you like the board to be?");
		int n = BOARD.nextInt();
		int xCord = 0;
		int yCord = 0;
		while(n > 30 || n < 2){
			System.out.println("Please enter a valid input.");
			n = BOARD.nextInt();
		}
		while (n <= 30 && n >= 2) {
			char[][] board = new char[n][n];
			System.out.println("How many mines should be placed on the board?");
			int m = BOARD.nextInt();
			while(m>= n*n){
				System.out.println("Please enter a valid number of mines");
				m = BOARD.nextInt();
			}
			if(m < n*n){
			for (int i = 0; i < m; i++) {
				xCord = (int) (Math.random() * n);
				yCord = (int) (Math.random() * n);
				while (board[xCord][yCord] == 'M') {
					yCord = (int) (Math.random() * n);
					xCord = (int) (Math.random() * n);
					}
					board[xCord][yCord] = 'M' ;
				}
			}
			for (int i = 0; i < (n*n)-m; i++) {
				xCord = (int) (Math.random() * n);
				yCord = (int) (Math.random() * n);
				while (board[xCord][yCord] == '0' || board[xCord][yCord] == 'M') {
					yCord = (int) (Math.random() * n);
					xCord = (int) (Math.random() * n);
					}
					board[xCord][yCord] = '0' ;
			}
			for(int i = 0; i < board.length-1; i++){
				for(int j = 0; j <board.length-1; j++){
					if(board[i][j] == 'M'){
						try{
								board[i][j+1] = '1';
								board[i][j-1] = '1';
								board[i+1][j+1] = '1';
								board[i+1][j-1] = '1';
								board[i+1][j] = '1';
								board[i-1][j] = '1';
								board[i-1][j-1] = '1';
								board[i-1][j+1] = '1';
								}
								
						catch(IndexOutOfBoundsException e){
							if(i==0 && j == 0){
								board[i][j+1] = '1';
								board[i+1][j] = '1';
								board[i+1][j+1] = '1';	
							}
							if(i==0 && j == n-1){
								board[i+1][j-1] = '1';
								board[i][j-1] = '1';
								board[i+1][j] = '1';
							}
							if(j==0 && i<= board.length-1 && i > 0){
								board[i+1][j] = '1';
								board[i+1][j+1] = '1';
								board[i][j+1] = '1';
								board[i-1][j] = '1';
								board[i-1][j+1] = '1';
							}
							if(j==0 && i == board.length-1){
								board[i-1][j] = '1';
								board[i-1][j+1] = '1';
								board[i][j+1] = '1';
							}
							if(j== board.length-1 && i == board.length-1){
								board[i-1][j] = '1';
								board[i-1][j-1] = '1';
								board[i][j-1] = '1';
							}
							if(i== board.length-1 && j > 0 && j < board.length-1){
								board[i-1][j] = '1';
								board[i-1][j+1] = '1';
								board[i][j+1] = '1';
								board[i][j-1] = '1';
								board[i-1][j-1] = '1';
							}
							
							
						}
					}
				}
			}
			for(int i = 0; i < board.length; i++){
				for(int j = 0; j <board.length; j++){
					System.out.print(board[i][j]);
					}
				System.out.println(" ");
				}
		}
	}
}
