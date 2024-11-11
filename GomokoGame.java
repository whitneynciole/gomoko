/*
   Filename:	 	GomokoGame.java
   Programmer:	WHALLEY Whitney Nicole
   Student Number: 240315876
   Class: SE1A
   Description:	Create a multiplication table
*/
import java.util.*; 

public class GomokoGame{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

// Declare variables
int 

// Declare array for printing game table 
int [][] mTable = new int[10][10];

//print game table
   for (int i = 0; i < 10; i++) {
        System.out.print(i + "|") 
       for(int j = 0; j < 10; j++){ 
        System.out.print(mTable[i][j]);
   }
   System.out.println();
}
System.out.println("+------------------------------");
System.out.println("   " + "0  1  2  3  4  5  6  7  8  9");

//Start the game 

int currentPlayer = 1;
boolean gameFinished = false; 

    while (gameFinished == false){
        System.out.println("Player " + currentPlayer + "'s turn.");
        System.out.println("Enter row and column (e.g., 0 1): ");
        int row = input.nextInt();
        int col = input.nextInt();
    }



// to ensure the players input in valid ( within the range of the table) and not already occupied (would be a 1 or 2 if already taken)
if (row < 0 || row >= 10 || col < 0 || col >= 10) {
    System.out.println("Out of range! Input again.");
} else if (mTable[row][col] != 0) {
    System.out.println("Invalid move. Try again.");
} else {


}
}
}


//// 