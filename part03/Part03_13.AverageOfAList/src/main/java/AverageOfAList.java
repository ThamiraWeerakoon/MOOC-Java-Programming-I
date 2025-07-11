
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        double average = (double) sum / list.size();
        System.out.println("Average: " + average);
    }
}
