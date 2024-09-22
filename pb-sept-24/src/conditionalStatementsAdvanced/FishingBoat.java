package conditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double price = switch (season) {
            case "Spring" -> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0;
        };

        if (fisherman <= 6) {
            price = price - (price * 10 / 100);
        } else if (fisherman < 12) {
            price = price - (price * 15 / 100);
        } else {
            price = price - (price * 25 / 100);
        }

        if (fisherman % 2 == 0 && !"Autumn".equals(season)) {
            price = price - (price * 5 / 100);
        }


        double diff = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
