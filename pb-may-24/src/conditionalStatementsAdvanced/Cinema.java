package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int seats = r * c;

        double income = switch (type) {
            case "Premiere" -> seats * 12;
            case "Normal" -> seats * 7.5;
            case "Discount" -> seats * 5;
            default -> 0;
        };

        System.out.printf("%.2f", income);
    }
}
