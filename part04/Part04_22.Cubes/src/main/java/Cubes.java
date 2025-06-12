
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            int x = Integer.parseInt(line);
            System.out.println(x * x * x);
        }
    }
}
