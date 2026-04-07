import java.io.*;
import java.text.*;
import java.util.Scanner;
//shell
class DSPortfolio5 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Please enter your Sentence");
String text = input.nextLine();
int vowels = 0;
int consonants = 0;
int special = 0;
String lower = text.toLowerCase();
for (int i = 0; i < lower.length(); i++) {
char ch = lower.charAt(i);
if (ch >= 'a' && ch <= 'z') {
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vowels++;
} else {
consonants++;
}
} else {
         special++;
   }
  }
 
 System.out.println("\nYour String was this --> " + text);
 System.out.println("\nYour String has" + vowels + " Vowels");
 System.out.println("Your String has " + consonants + " Consonants");
 System.out.println("Your String has " + special + " Special Characters");
 
 }//End Main
 }