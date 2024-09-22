package conditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int flowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (type) {
            case "Roses" -> {
                price = flowers * 5;
                if (flowers > 80) {
                    price = price - (price * 10 / 100);
                }
            }
            case "Dahlias" -> {
                price = flowers * 3.8;
                if (flowers > 90) {
                    price = price - (price * 15 / 100);
                }
            }
            case "Tulips" -> {
                price = flowers * 2.8;
                if (flowers > 80) {
                    price = price - (price * 15 / 100);
                }
            }
            case "Narcissus" -> {
                price = flowers * 3;
                if (flowers < 120) {
                    price = price + (price * 15 / 100);
                }
            }
            case "Gladiolus" -> {
                price = flowers * 2.5;
                if (flowers < 80) {
                    price = price + (price * 20 / 100);
                }
            }
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowers, type, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",
                    price - budget);
        }
    }
}
