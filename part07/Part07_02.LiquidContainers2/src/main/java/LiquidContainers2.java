
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputArray = input.split(" ");
            if (inputArray[0].equals("add")) {
                int amount = Integer.parseInt(inputArray[1]);
                container1.add(amount);
            } else if (inputArray[0].equals("move")) {
                int amount = Integer.parseInt(inputArray[1]);
                if (container1.contains() >= amount) {
                    container1.remove(amount);
                    container2.add(amount);
                } else {
                    amount = container1.contains();
                    container1.remove(amount);
                    container2.add(amount);
                }

            } else if (inputArray[0].equals("remove")) {
                int amount = Integer.parseInt(inputArray[1]);
                container2.remove(amount);
            }

        }
    }

}
