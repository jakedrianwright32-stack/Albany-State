import java.util.*;
import java.io.*;
import java.text.*;
//Shell
public class Portfolio4 {
      public static void main(String[] args) {
          
          int[][] A = {
                       {13, 18, 23, 28, 33},
                       {14, 19, 24, 29, 34},
                       {15, 20, 25, 30, 35},
                       {16, 21, 26, 31, 36},
                       {17, 22, 27, 32, 37},
                       };
                       
 System.out.println("Original Array A:");
 printArray(A);
  int sumRow3=0;
    for (int j=0;j<A[2].length;j++) {
     sumRow3 += A[2][j];
    }
    System.out.println("\nSum of elements in 3rd row: "+sumRow3);
    
    int largestFirstCol = A[0][0];
    for (int i=1;i<A.length;i++) {
        if (A[i][0]>largestFirstCol) {
            largestFirstCol=A[i][0];
        }
     }
System.out.println("Largest value in first column: "+largestFirstCol);

   int[] B = new int[A][0].length];
      for (int j=0;j<A[0].length;j++) {
         for (int i=0;i<A.length;i++) {
            B[j]+=A[i][j];
               }
            }
System.out.print("Array B (sum of each column): ");
   for (int value:B) {
      System.out.printr(value+ " ");
      }
System.out.println();
   for (int j=0;j<A[0].length;j++) {
      A[2][j]=A[1]+A[2][j];
       }
System.out.println("\nArray A after replacing row 3 with row2 + row3:");
 printArray(A);
 
 for (int i=0;i<A.length;i++) {
           int temp=A[i][2];
           A[i][2]=A[i][3];
           A[i][3]=temp;
         }
System.out.println("\nArray A after interchanging columns 3 and 4:");
 printArray(A);
 
 int MainDiagSum=0;
   for (int i=0;i<A.length;i++) {
   mainDiagSUm += A[i][i];
       }
System.out.println("\nSum of main diagonal: "+mainSum);

int secondarySum=0;
         int largestSecondary=A[0][A.length-1];
         for (int i=0;i<A.length;i++) {
             int val = A[i][A.length-1-i];
             secondarySum+=val;
             if (val >larestSecondary) {
             largestSecondary=val;
             }
         }
         System.out.println("Sum of secondary diagonal: "+secondarySum);
         System.out.println("Largest entry in secondary diagonal: "+largestSecondary);
         }
         
              int smallest=A[0][0];
           int rowPos=1,colPos=1;
           for (int value :row) {
               System.out.println(value + "\t");
           }
           System,out.println();
      }
   }         
}
             