import java.util.*;
import java.io.*;
import java.text.*;
public class Portfolio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] data = loadFile("Anime.txt");
        if (data == null) return; 
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n===== ANIME STATS MENU =====");
            System.out.println("1. Display All Data");
            System.out.println("2. Search by Character Name");
            System.out.println("3. Show Power Level Statistics");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(input.nextLine().trim());
            if (choice == 1) {
                displayData(data);
            } 
            else if (choice == 2) {
                System.out.print("Search name: ");
                String key = input.nextLine().trim().toLowerCase();
                search(data, key);
            } 
            else if (choice == 3) {
                showStats(data);
            }
            else if (choice == 4) {
                System.out.println("Goodbye!");
            } 
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public static String[][] loadFile(String filename) {
        try {
            List<String[]> rows = new ArrayList<>();
            Scanner file = new Scanner(new File(filename));
            while (file.hasNextLine()) {
                String line = file.nextLine().trim();
                String[] parts = line.split(",");
                rows.add(parts);
            }
            String[][] array = new String[rows.size()][4];
            return rows.toArray(array);
        } catch (Exception e) {
            System.out.println("Error: File not found.");
            return null;
        }
    }
    public static void displayData(String[][] data) {
        System.out.println("\nNAME\tSERIES\tPOWER\tROLE");
        for (int i = 0; i < data.length; i++) {  
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j].trim() + "\t");  
            }
            System.out.println();
        }
    }
    public static void search(String[][] data, String key) {
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].toLowerCase().contains(key)) {  
                System.out.println(Arrays.toString(data[i]));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Character not found.");
        }
    }
    public static void showStats(String[][] data) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            int power = Integer.parseInt(data[i][2].trim());
            min = Math.min(min, power);
            max = Math.max(max, power);
            total += power;
        }
        double avg = (double) total / data.length;
        System.out.println("\nSTATS:");
        System.out.println("Lowest Power: " + min);
        System.out.println("Highest Power: " + max);
        System.out.println("Average Power: " + avg);
    }
}
