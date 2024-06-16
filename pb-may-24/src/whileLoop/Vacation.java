package whileLoop;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int spendCount = 0;
        int days = 0;

        while (availableMoney < excursionPrice && spendCount < 5) {
            ++days;
            switch (scanner.nextLine()) {
                case "spend" -> {
                    availableMoney -= Double.parseDouble(scanner.nextLine());
                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }

                    spendCount++;
                }
                case "save" -> {
                    availableMoney += Double.parseDouble(scanner.nextLine());
                    if (spendCount > 0) {
                        spendCount = 0;
                    }
                }
            }
        }

        if (spendCount >= 5 || availableMoney < excursionPrice) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
