package whileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int space = w * l * h;

        String input;
        while (space > 0 && !"Done".equals(input = scanner.nextLine())) {
            space -= Integer.parseInt(input);
        }

        if (space > 0) {
            System.out.printf("%d Cubic meters left.", space);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.",
                    Math.abs(space));
        }
    }
}
