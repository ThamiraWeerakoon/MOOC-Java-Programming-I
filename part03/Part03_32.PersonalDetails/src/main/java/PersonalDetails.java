
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] tokens = input.split(",");
            count++;
            sum += Integer.valueOf(tokens[1]);
            if (name.length() < tokens[0].length()) {
                name = tokens[0];
            }
        }
        double average = (double) sum / count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
