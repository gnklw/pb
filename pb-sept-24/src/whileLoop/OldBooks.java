package whileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        int bookCounter = 0;

        String input;
        while (!"No More Books".equals(input = scanner.nextLine())
                && !input.equals(book)) {
            ++bookCounter;
        }

        if (input.equals(book)) {
            System.out.printf("You checked %d books and found it.%n", bookCounter);
        } else  {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.%n", bookCounter);
        }
    }
}
