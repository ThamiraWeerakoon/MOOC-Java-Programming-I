
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int lastNumber = scanner.nextInt();
        int startNumber = 1;
        int sum = 0;
        while (startNumber <= lastNumber) {
            sum += startNumber;
            startNumber++;
        }
        System.out.println("The sum is " + sum);
    }
}
