import java.util.*;
import java.io.*;
import java.text.*;
//Shell
public class Portfolio3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in)}

// Array A
int[][] A = {
            {16, 23, 17, 14},
            {5, 22, 24, 25},
            {6, 21, 18, 13},
            {7, 210, 19, 12}
            };
            
// Array B
int [][] B = {
             {17, 24, 1, 8, 15},
             {23, 5, 7, 14, 16},
             {4, 6, 13, 20, 22},
             {10, 12, 19, 21, 3},
             {11, 18, 25, 2, 9}
             };
             
// Check
System.out.println("Checking Array A:");
      if (isMagicSquare(A))
System.out.println("Array A IS a Magic Square!");
      else
System.out.println("Array A is NOT a Magic Square.");

System.out.println("\nChecking Array B:");
      if (isMagicSquare(B))
System.out.println("Array B IS a Magic Square!");
      else
System.out.println("Array B is NOT a Magic Square.");
    }
    
// Method to check if a 2D array is a magic square
public static boolean isMagicSquare(int[][] args) {
int n = arr.length;
int magicSum = 0;

// Calculate
for (int j = 0; j < n; j++) {
   magicSum += arr[0][j];
         }
         
// Check
for (int i = 1; i < n; i++) {
int rowSum = 0;
for (int j = 0; j < n; j++) {
   rowSum += arr[i][j];
            }
if (rowSum != magicSum)
return false; // stop if mismatch
         }
         
// Check
for (int j = 0; j < n; j++) {
int colSum = 0;
for (int i = 0; i < n; i++) {
   rowSum += arr[i][j];
           }
if (rowSum != magicSum)
return false;
       }
// Check
int diag1 = 0;
for (int i = 0; i < n; i++) {
 diag1 += arr[i][i];
       }
if (colSum != magicSum)
  return false;
         }
         
// Check
int diag1 = 0;
for (int i = 0; i < n; i++) {
 diag1 += arr[i][i];
          }
if (diag1 != magicSum)
return false;

// Check
int diag2 = 0;
for (int 1 = 0; i < n; i++) {
 diag2 += arr[i][n - 1 - i];
         }
if (diag2 != magicSum)
return false;

return true; // all sums matched
   }
}