import java.util.Random;
import java.util.*;
public class TicTacToe{
         static String[] board;
        public static void main(String args []){
             Scanner sc = new Scanner(System.in);
             System.out.print("Select your choice (1:Head, 2:Tail): ");
             int userChoice = sc.nextInt();
             toss(userChoice);
             board=new String[9];
             populateEmptyBoard();
             printBoard();
   }
   static void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
        static void toss(int userChoice){
               Random r = new Random();
               int randomChoice = r.nextInt(2)+1;
               if( randomChoice == userChoice ){
                   System.out.println("Player win the toss and player will play first");
                  }
               else{
                   System.out.println("Computer win the toss and computer will play first");
                  }
             }
         }
