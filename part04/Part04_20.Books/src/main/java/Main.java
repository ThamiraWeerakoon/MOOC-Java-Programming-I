import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) break;
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());
            list.add(new Book(title, pages, year));
        }

        System.out.print("\nWhat information will be printed? ");
        String info = scanner.nextLine();
        if (info.equals("everything")) {
            for (Book book : list) {
                System.out.println(book);
            }
        } else if (info.equals("name")) {
            for (Book book : list) {
                System.out.println(book.getTitle());
            }
        }
    }
}
