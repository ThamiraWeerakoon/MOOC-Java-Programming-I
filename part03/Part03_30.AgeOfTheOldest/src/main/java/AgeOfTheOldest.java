
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] words = input.split(",");

            if (age < Integer.valueOf(words[1])) {
                age = Integer.valueOf(words[1]);
            }
        }
        System.out.print("Age of the oldest: " + age);
    }
}
