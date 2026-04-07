import java.util.*;
import java.io.*;
import java.text.*;

public class Portfolio1 {

// Main method: This is where the program execution starts.
public static void main(String[] args) {
// Program 1 - Multiplication Table for 10
System.out.println("Multiplication Table for 10");
System.out.println("---------------------------");
     
// Call the method to print the table
printTable();
     }
     
// Method to print the table: This structure fixes your original error.
// It must be placed outside of the main method.
public static void printTable() {
// Loop for Rows (i)
for (int i = 1; i <= 10; i++) {
// Loop for Columns (j)
for (int j = 1; j <= 10; j++) {
// Print the product with a tab (\t) for separation
System.out.print((i * j) + "\t");
    }
// Move to the next line after each row is complete
System.out.println();
         }
