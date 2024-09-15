package conditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От спечелените пари Петя трябва да даде 10% за наема на магазина. Да се пресметне дали парите
        // ще ѝ стигнат да отиде на екскурзия.

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double profit = (puzzles * 2.6)
                + (dolls * 3)
                + (bears * 4.1)
                + (minions * 8.2)
                + (trucks * 2);

        if (puzzles + dolls + bears + minions + trucks >= 50) {
            profit = profit - (profit * 25 / 100);
        }

        profit = profit - (profit * 10 / 100);

        if (trip <= profit) {
            System.out.printf("Yes! %.2f lv left.", profit - trip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", trip - profit);
        }
    }
}
