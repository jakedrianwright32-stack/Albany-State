import java.util.*;
import java.io.*;
import java.text.*;
//Shell
class DSPortfolio2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int choice;
      
      do {
         System.out.println("*********************");
         System.out.println("\n* Roman Numeral Calculator and Converter *");
         System.out.println("* 1. Calculator *");
         System.out.println("* 2. Conversions *");
         System.out.println("* 3. Exit *");
         System.out.print("Enter your choice: ");
         choice = input.nextInt();
         
         switch (choice) {
            case 1:
               calculatorMenu(input);
               break;
            case 2:
               conversionMenu(input);
               break;
            case 3:
               System.out.println("Everyone Should Pass");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      } while (choice != 3);
      
      input.close();
   }
   
   public static void calculatorMenu(Scanner input) {
      System.out.println("\nCalculator Menu");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.print("Choose an operation: ");
      int operation = input.nextInt();
      
      System.out.print("Enter first Roman numeral: ");
      String roman1 = input.next();
      System.out.print("Enter second Roman numeral: ");
      String roman2 = input.next();
      
      PROGRAM2 num1 = new PROGRAM2(roman1);
      PROGRAM2 num2 = new PROGRAM2(roman2);
      
      int result = 0;
      switch (operation) {
         case 1:
            result = num1.getNum() + num2.getNum();
            break;
         case 2:
            result = num1.getNum() - num2.getNum();
            break;
         case 3:
            result = num1.getNum() * num2.getNum();
            break;
         case 4:
            if (num2.getNum() != 0) {
               result = num1.getNum() / num2.getNum();
            } else {
               System.out.println("Error: Division by zero.");
               return;
            }
            break;
         default:
            System.out.println("Invalid operation.");
            return;
      }
      
      PROGRAM2 resultRoman = new PROGRAM2(result);
      System.out.println("Result: " + result + " (" + resultRoman.getRom() + ")");
   }
   
   public static void conversionMenu(Scanner input) {
      System.out.println("\nConversion Menu");
      System.out.println("1. To Roman Numeral");
      System.out.println("2. From Roman Numeral");
      System.out.print("Choose a conversion: ");
      int conversion = input.nextInt();
      
      if (conversion == 1) {
         System.out.print("Enter a decimal number: ");
         int decimal = input.nextInt();
         PROGRAM2 numToRoman = new PROGRAM2(decimal);
         System.out.println(decimal + " in Roman numerals: " + numToRoman.getRom());
      } else if (conversion == 2) {
         System.out.print("Enter a Roman numeral: ");
         String roman = input.next();
         PROGRAM2 romanToNum = new PROGRAM2(roman);
         System.out.println(roman + " in decimal: " + romanToNum.getNum());
      } else {
         System.out.println("Invalid choice.");
      }
   }
}//End Class