import java.util.*;
import java.io.*;
import java.text.*;
public class Portfolio6 {
    public static void main(String[] args) throws FileNotFoundException {
        final int TEAMS = 22;
        final int YEARS = 5;
        String[] teams = new String[TEAMS];
        int[][] scores = new int[TEAMS][YEARS];
        Scanner file = new Scanner(new File("Football.txt"));
        int row = 0;
        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] parts = line.split(",");
            teams[row] = parts[0];
            for (int col = 0; col < YEARS; col++) {
                scores[row][col] = Integer.parseInt(parts[col + 1]);
            }
            row++;
        }
        file.close();
        // Display Table
        System.out.println("Team\t\t\tY1\tY2\tY3\tY4\tY5");
        for (int i = 0; i < TEAMS; i++) {
            System.out.print(teams[i] + "\t");
            for (int j = 0; j < YEARS; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }
        // Largest score each year
        System.out.println("\nLargest Score Each Year:");
        for (int year = 0; year < YEARS; year++) {
            int max = scores[0][year];
            int index = 0;
            for (int team = 1; team < TEAMS; team++) {
                if (scores[team][year] > max) {
                    max = scores[team][year];
                    index = team;
                }
            }
            System.out.println("Year " + (year + 1) + ": " + teams[index] + " - " + max);
        }
        // Average score per team
        double highestAvg = 0;
        int bestAvgTeam = 0;
        for (int i = 0; i < TEAMS; i++) {
            int sum = 0;
            for (int j = 0; j < YEARS; j++) {
                sum += scores[i][j];
            }
            double avg = sum / 5.0;
            if (avg > highestAvg) {
                highestAvg = avg;
                bestAvgTeam = i;
            }
        }
        System.out.println("\nHighest Average Score:");
        System.out.println(teams[bestAvgTeam] + " - " + highestAvg);
        // Most total points
        int maxTotal = 0;
        int bestTotalTeam = 0;
        for (int i = 0; i < TEAMS; i++) {
            int total = 0;
            for (int j = 0; j < YEARS; j++) {
                total += scores[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                bestTotalTeam = i;
            }
        }
        System.out.println("\nMost Total Points:");
        System.out.println(teams[bestTotalTeam] + " - " + maxTotal);
    }
}
