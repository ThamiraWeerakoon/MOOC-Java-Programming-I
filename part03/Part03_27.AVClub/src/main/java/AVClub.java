
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] tokens = input.split(" ");
            for (String token : tokens) {
                if (token.contains("av")) {
                    System.out.println(token);
                }
            }
        }
    }
}
