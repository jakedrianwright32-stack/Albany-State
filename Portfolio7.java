import java.util.*;
import java.io.*;
import java.text.*;
public class Portfolio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] board = new int[9][9];
        System.out.println("Enter the Sudoku board (9 lines, 9 numbers each):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = input.nextInt();
                while (value < 0 || value > 9) {
                    System.out.print("Invalid entry. Enter number 0–9: ");
                    value = input.nextInt();
                }
                board[i][j] = value;
            }
        }
        
        System.out.println("\nBoard:");
        printBoard(board);
        boolean valid = true;
        valid &= checkRows(board);
        valid &= checkColumns(board);
        valid &= checkBoxes(board);
        if (valid) {
            System.out.println("\nSudoku is VALID");
        } else {
            System.out.println("\nSudoku is INVALID");
        }
        input.close();
    }
   
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0)
                System.out.println("------+-------+------");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
   
    public static boolean checkRows(int[][] board) {
        boolean valid = true;
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                if (num != 0) {
                    if (seen[num]) {
                        System.out.println("ROW " + i + ": duplicate " + num);
                        valid = false;
                    }
                    seen[num] = true;
                }
            }
        }
        return valid;
    }
    
    public static boolean checkColumns(int[][] board) {
        boolean valid = true;
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int num = board[i][j];
                if (num != 0) {
                    if (seen[num]) {
                        System.out.println("COL " + j + ": duplicate " + num);
                        valid = false;
                    }
                    seen[num] = true;
                }
            }
        }
        return valid;
    }
       public static boolean checkBoxes(int[][] board) {
        boolean valid = true;
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                boolean[] seen = new boolean[10];
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        int num = board[i][j];
                        if (num != 0) {
                            if (seen[num]) {
                                System.out.println("BOX " + row + "," + col +
                                        ": duplicate " + num);
                                valid = false;
                            }
                            seen[num] = true;
                        }
                    }
                }
            }
        }
        return valid;
    }
}
