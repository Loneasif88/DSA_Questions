import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        board[i][j] = sc.next().charAt(0);
      }
    }
    sc.close();
    solveSudoku(board);
    if (isValidSudoku(board)) System.out.println(
      "correct"
    ); else System.out.println("incorrect");
  }

  public static void solveSudoku(char[][] board) {
    // your code here
	  isValidSudoku(board);
	  print(board);
  }
	public static boolean isValidSudoku(char[][] board){
		boolean isValid = false;
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				if(board[i][j] == '.'){
					for(char num = '1'; num <= '9'; num++){
						if(solve(board,i,j,num)){
							board[i][j] = num;
							if(isValidSudoku(board)){
								return true;     //return true and sucessfully solved
							}
							board[i][j] = '.';  //backtrack 
						}
					}
					return false; // no valid num found in this cell
				}
			}
		}
		return true; // all cell are filled
	}
	public static boolean solve(char[][] board, int row, int col, char num){
		for(int i=0; i<9; i++){
			if(board[row][i] == num || board[i][col] == num || board[3 * (row/3) + i/3][3 * (col/3) + i%3] == num){
				return false;
			}
		}
		return true;
		
	}
  //Printing the matrix
	public static void print(char[][] board){
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
