package conditionalStatements;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = scanner.nextDouble();

        int puzzles = scanner.nextInt();
        int dolls = scanner.nextInt();
        int bears = scanner.nextInt();
        int minions = scanner.nextInt();
        int trucks = scanner.nextInt();

        double profit = (puzzles * 2.6)
                + (dolls * 3)
                + (bears * 4.1)
                + (minions * 8.2)
                + (trucks * 2);

        if (puzzles + dolls + bears + minions + trucks >= 50) {
            profit = profit - (profit * 25 / 100);
        }

        profit = profit - (profit * 10 / 100);

        double diff = Math.abs(profit - trip);

        if (profit >= trip) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
