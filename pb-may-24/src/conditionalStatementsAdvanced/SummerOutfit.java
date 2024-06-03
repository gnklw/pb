package conditionalStatementsAdvanced;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int deg = scanner.nextInt();
        scanner.nextLine();
        String partOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        boolean cold = deg >= 10 && deg <= 18;
        boolean warm = deg > 18 && deg <= 24;
        boolean hot = deg > 24;

        switch (partOfDay) {
            case "Morning":
                if (cold) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (warm) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (hot) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (cold) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (warm) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (hot) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (cold) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (warm) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (hot) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }

        System.out.printf("It's %d degrees, get your %s and %s.",
                deg, outfit, shoes);
    }
}
