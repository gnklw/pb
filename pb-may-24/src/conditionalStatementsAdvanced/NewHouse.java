package conditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price;

        switch (flowersType) {
            case "Roses" -> {
                price = numberOfFlowers * 5;
                if (numberOfFlowers > 80) {
                    price = price - (price * 10 / 100);
                }
            }
            case "Dahlias" -> {
                price = numberOfFlowers * 3.8;
                if (numberOfFlowers > 90) {
                    price = price - (price * 15 / 100);
                }
            }
            case "Tulips" -> {
                price = numberOfFlowers * 2.8;
                if (numberOfFlowers > 80) {
                    price = price - (price * 15 / 100);
                }
            }
            case "Narcissus" -> {
                price = numberOfFlowers * 3;
                if (numberOfFlowers < 120) {
                    price = price + (price * 15 / 100);
                }
            }
            case "Gladiolus" -> {
                price = numberOfFlowers * 2.50;
                if (numberOfFlowers < 80) {
                    price = price + (price * 20 / 100);
                }
            }
            default -> {
                price = 0.0;
            }
        }

        double diff = Math.abs(price - budget);

        if (price <= budget) {
            System.out.printf(
                    "Hey, you have a great garden with %d %s and %.2f leva left.",
                    numberOfFlowers, flowersType, diff
            );
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}