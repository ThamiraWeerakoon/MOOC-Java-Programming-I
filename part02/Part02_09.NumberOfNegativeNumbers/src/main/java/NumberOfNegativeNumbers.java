
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number < 0) {
                count++;
            }
            if (number == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
