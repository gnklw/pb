package whileLoop;

import java.util.Scanner;

public class OldBooks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        int booksCount = 0;
        String currentBook;
        while (!"No More Books".equals(currentBook = scanner.nextLine())
                && !currentBook.equals(book)) {
            ++booksCount;
        }

        if (currentBook.equals(book)) {
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", booksCount);
        }
    }
}
