package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination;
        double expenses;
        if (budget > 0 && (season.equals("winter") || season.equals("summer"))) {
            if (budget <= 100) {
                destination = "Bulgaria";
                expenses = switch (season) {
                    case "winter" -> budget * 70 / 100;
                    case "summer" -> budget * 30 / 100;
                    default -> 0;
                };
            } else if (budget <= 1000) {
                destination = "Balkans";
                expenses = switch (season) {
                    case "winter" -> budget * 80 / 100;
                    case "summer" -> budget * 40 / 100;
                    default -> 0;
                };
            } else {
                destination = "Europe";
                expenses = budget * 90 / 100;
            }

            String type = "";
            if ("winter".equals(season) || "Europe".equals(destination)) {
                type = "Hotel";
            } else if ("summer".equals(season)) {
                type = "Camp";
            }

            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f", type, expenses);
        }
    }
}
