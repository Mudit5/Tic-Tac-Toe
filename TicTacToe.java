package basic.Java;
import java.util.Scanner;


public class TicTacToe {
	static int [][] board = new int [3][3];
	static Scanner sc = new Scanner(System.in);
	static int moveCount = 0;
	static Integer player = 1;
	static Integer winner = 0;
	
	public static void main(String[] args) {
		
		System.out.println("GAME BEGINS!!!!!");
		printBoard();
		System.out.println();
		while(winner == 0) {
			System.out.println("Player " + player + " give your next move");
			System.out.print("Enter the next move row :: ");
			int row = sc.nextInt() - 1;
			System.out.print("Enter the next move column :: ");
			int col = sc.nextInt() - 1; 
			int moveStatus = makeMove(row, col);
			if(moveStatus == 0)
				continue;
			else if(moveStatus == 2) {
				System.out.println("No more moves left. The Game has ended in a draw.");
				break;
			}
		}
	}
	
	private static int makeMove(int row, int col) {
		if(checkMoveValid(row, col)==true){
			board[row][col] = player;
			moveCount++;
		}
		else {
			System.out.println("The place is already marked, choose another position.");
			return 0;
		}
		
		printBoard();
		int winnerStatus = checkWinner(row, col);
		if(winnerStatus == 2) {
			return 2;
		}
		if(winnerStatus == 0) {
			togglePlayer();
		}
		return 1;
	}
	private static boolean checkMoveValid(int row, int col) {
		if(board[row][col] == 0)
			return true;
		return false;
	}

	private static void togglePlayer() {
		if(player == 1)
			player = 2;
		else 
			player = 1;
	}

	private static int checkWinner(int row, int col) {
		int rowScore = 0, colScore=0, diagScore1=0, diagScore2=0;
		
		for(int i=0; i<board[0].length; i++) {
			if(board[row][i] == player)
				rowScore++;
		}	
		
		for(int i=0; i<board.length; i++) {
			if(board[i][col] == player)
				colScore++;
		}
		
		for(int i=0, j=0; i<board.length && j<board[i].length ; i++, j++) {
			if(board[i][j] == player)
				diagScore1++;
		}
		
		for(int i=0, j=board[0].length-1; i<board.length && j>=0; i++, j--) {
			if(board[i][col] == player)
				diagScore2++;
		}
		
		if(rowScore == 3 || colScore == 3 || diagScore1 == 3 || diagScore2 == 3) {
			winner = player;
			System.out.println("GAME OVER !!!!!!");
			System.out.println("Winner is "+ winner);
			return 1;
		}
		else {
			if(moveCount == 9) {
				return 2;
			}
			return 0;
		}
		
	}

	private static void printBoard() {
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j] == 1) 
					System.out.print('o' + "  ");
				else if(board[i][j] == 2)
					System.out.print('x' + "  ");
				else
					System.out.print('-' + "  ");
			}
			System.out.println();
		}
	}
}
