
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int integer = scan.nextInt();
        System.out.println("Give a double:");
        double doubleValue = scan.nextDouble();
        System.out.println("Give a boolean:");
        boolean boolValue = scan.nextBoolean();
        System.out.println("You gave the string "+text);
        System.out.println("You gave the integer "+integer);
        System.out.println("You gave the double "+doubleValue);
        System.out.println("You gave the boolean "+boolValue);
    }
}
