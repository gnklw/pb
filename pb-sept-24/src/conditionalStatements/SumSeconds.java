package conditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int result = a + b + c;

        int min = result / 60;
        int sec = result % 60;

        System.out.printf("%d:%02d%n", min, sec);

    }
}
