
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            int count = 0;
            int wins = 0;
            int losses = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] record = line.split(",");
                if (line.contains(team)) {
                    count++;
                    if (Integer.parseInt(record[2]) > Integer.parseInt(record[3])) {
                        if (record[0].equals(team)) {
                            wins++;
                        } else {
                            losses++;
                        }
                    } else {
                        if (record[0].equals(team)) {
                            losses++;
                        } else {
                            wins++;
                        }
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
