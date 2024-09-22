package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        String season = scanner.next();

        String destiantion = "";
        double price = 0;

        if (budget <= 100) {
            destiantion = "Bulgaria";
            price = switch (season) {
                case "winter"-> budget * 70 / 100;
                case "summer"-> budget * 30 / 100;
                default -> price;
            };
        } else if (budget <= 1000) {
            destiantion = "Balkans";
            price = switch (season) {
                case "winter"-> budget * 80 / 100;
                case "summer"-> budget * 40 / 100;
                default -> price;
            };
        } else {
            destiantion = "Europe";
            price = switch (season) {
                case "winter", "summer" -> budget * 90 / 100;
                default -> price;
            };
        }

        String type = "";

        if (destiantion.equals("Europe") || season.equals("winter")) {
            type = "Hotel";
        } else if (season.equals("summer")) {
            type = "Camp";
        }

        System.out.printf("Somewhere in %s%n", destiantion);
        System.out.printf("%s - %.2f%n", type, price);
    }
}
