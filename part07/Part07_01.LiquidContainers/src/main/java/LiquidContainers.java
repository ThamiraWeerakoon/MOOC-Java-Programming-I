
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputArray = input.split(" ");
            if (inputArray[0].equals("add")) {
                int amount = Integer.parseInt(inputArray[1]);
                if (amount > 0) {
                    if ((first + amount) <= 100) {
                        first += amount;
                    } else {
                        first = 100;
                    }
                }
            } else if (inputArray[0].equals("move")) {
                int amount = Integer.parseInt(inputArray[1]);
                if (amount > 0) {
                    if (amount > first) {
                        if (second + first <= 100) {
                            second += first;
                        } else {
                            second = 100;
                        }
                        first = 0;
                    } else {
                        first -= amount;
                        if (second + amount <= 100) {
                            second += amount;
                        } else {
                            second = 100;
                        }
                    }
                }
            } else if (inputArray[0].equals("remove")) {
                int amount = Integer.parseInt(inputArray[1]);
                if (amount > 0) {
                    if (amount > second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                }
            }

        }
    }

}
