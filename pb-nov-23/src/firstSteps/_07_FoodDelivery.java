package firstSteps;

import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChickenMenu = Integer.parseInt(scanner.nextLine());
        int numFishMenu = Integer.parseInt(scanner.nextLine());
        int numVeganMenu = Integer.parseInt(scanner.nextLine());

        double priceChickenMenus = numChickenMenu * 10.35;
        double priceFishMenus = numFishMenu * 12.40;
        double priceVeganMenus = numVeganMenu * 8.15;

        double menusPrice = priceChickenMenus + priceFishMenus + priceVeganMenus;
        double dessertPrice = menusPrice * 20 / 100;

        double sum = menusPrice + dessertPrice + 2.50;

        System.out.println(sum);
    }
}
