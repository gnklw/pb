package whileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int freeSpace = w * l * h;

        String input;
        while (freeSpace > 0 && !"Done".equalsIgnoreCase(input = scanner.nextLine())) {
            freeSpace -= Integer.parseInt(input);
        }

        if (freeSpace > 0) {
            System.out.printf("%d Cubic meters left.", freeSpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        }
    }
}
