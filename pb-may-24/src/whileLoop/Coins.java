package whileLoop;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int coins = 0;

        int left = (int) Math.round(change * 100);

        while (left > 0) {
            if (left >= 200) {
                coins++;
                left -= 200;
            } else if (left >= 100) {
                coins++;
                left -= 100;
            } else if (left >= 50) {
                coins++;
                left -= 50;
            } else if (left >= 20) {
                coins++;
                left -= 20;
            } else if (left >= 10) {
                coins++;
                left -= 10;
            } else if (left >= 5) {
                coins++;
                left -= 5;
            } else if (left >= 2) {
                coins++;
                left -= 2;
            } else {
                coins++;
                left -= 1;
            }
        }

        System.out.println(coins);
    }
}
