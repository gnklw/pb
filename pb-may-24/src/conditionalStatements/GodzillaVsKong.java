package conditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int backgroundActors = scanner.nextInt();
        double costumePrice = scanner.nextDouble();

        double decorPrice = budget * 10 / 100;
        double costumesPrice = costumePrice * backgroundActors;

        if (backgroundActors >= 150) {
            costumesPrice = costumesPrice - (costumesPrice * 10 / 100);
        }

        double costs = decorPrice + costumesPrice;

        if (budget >= costs) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - costs);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", costs - budget);
        }
    }
}
