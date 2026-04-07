import java.util.*;
import java.io.*;
import java.text.*;
public class Portfolio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String USERNAME = "CSCI1302";
        final String PASSWORD = "FaLl25";
        System.out.print("Enter Username: ");
        String user = input.nextLine();
        System.out.print("Enter Password: ");
        String pass = input.nextLine();
        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("\nLogin Successful!\n");
            System.out.println("Welcome to the program!");
        } else {
            System.out.println("\nACCESS DENIED.");
        }
    }
}
