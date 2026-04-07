import java.util.*;
import java.io.*;
import java.text.*;
public class Portfolio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder sortedSentence = new StringBuilder();
        StringBuilder wordOrder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();
            Arrays.sort(letters);
            sortedSentence.append(new String(letters)).append(" ");
            // original sentence indices
            wordOrder.append(i).append(" ");
        }
        System.out.println("\n" + sortedSentence.toString().trim());
        System.out.println(wordOrder.toString().trim());
    }
}
