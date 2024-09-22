package conditionalStatementsAdvanced;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int deg = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();

        boolean cold = deg >= 10 && deg <= 18;
        boolean warm = deg > 18 && deg <= 24;
        boolean hot = deg > 24;

        String outfit = "";
        String shoes = "";

        switch (partOfDay) {
            case "Morning" -> {
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
            }
            case "Afternoon" -> {
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
            }
            case "Evening" -> {
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
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", deg, outfit, shoes);
    }


//   if (deg >= 10 && deg <= 18) {
//        switch (partOfDay) {
//            case "Morning" -> {
//
//            }
//            case "Afternoon" -> {
//
//            }
//            case "Evening" -> {
//
//            }
//        }
//    } else if (deg > 18 && deg <= 24) {
//        switch (partOfDay) {
//            case "Morning" -> {
//
//            }
//            case "Afternoon" -> {
//
//            }
//            case "Evening" -> {
//
//            }
//        }
//    } else if (deg > 24) {
//        switch (partOfDay) {
//            case "Morning" -> {
//
//            }
//            case "Afternoon" -> {
//
//            }
//            case "Evening" -> {
//
//            }
//        }
//    }
}
