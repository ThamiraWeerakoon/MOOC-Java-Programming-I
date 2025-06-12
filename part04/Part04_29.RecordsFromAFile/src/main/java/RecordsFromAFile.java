
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] words = line.split(",");
                if (Integer.parseInt(words[1]) == 1) {
                    System.out.println(words[0] + ", age: " + words[1] + " year");
                } else {
                    System.out.println(words[0] + ", age: " + words[1] + " years");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
