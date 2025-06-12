
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] words = input.split(",");
            if (age < Integer.valueOf(words[1])) {
                name = words[0];
                age = Integer.valueOf(words[1]);
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
