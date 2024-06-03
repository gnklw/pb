package conditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = scanner.nextInt();
        String season = scanner.next();
        int fishman = scanner.nextInt();

        double boatRent = switch (season) {
            case "Spring" -> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter" ->  2600;
            default -> 0;
        };

        double discount = 0;

        if (fishman <= 6) {
            discount = 10;
        } else if (fishman <= 11) {
            discount = 15;
        } else {
            discount = 25;
        }

        double totalPrice = boatRent - (boatRent * discount / 100);

        if (fishman % 2 == 0 && !season.equals("Autumn")) {
            totalPrice = totalPrice - (totalPrice * 5 / 100);
        }

        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
