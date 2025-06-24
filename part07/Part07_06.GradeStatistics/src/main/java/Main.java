
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        PointsManagement pointsManagement = new PointsManagement();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = scanner.nextInt();
            if (point == -1) {
                break;
            }
            pointsManagement.addPoint(point);
        }
        pointsManagement.print();
    }
}
