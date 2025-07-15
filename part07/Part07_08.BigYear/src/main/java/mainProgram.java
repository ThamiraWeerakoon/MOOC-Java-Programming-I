
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        while (true) {
            System.out.print("?");
            String input = scan.nextLine();

            if (input.equals("Quit")) {
                break;
            } else if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.println();
                System.out.print("Name in Latin");
                String latinName = scan.nextLine();
                birds.add(new Bird(name, latinName));
            } else if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                boolean observation = false;
                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        bird.addObservation();
                        observation = true;
                    }
                }
                if (!observation) {
                    System.out.println("Not a Bird");
                }
            } else if (input.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            } else if (input.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                    }
                }
            }
        }

    }

}
