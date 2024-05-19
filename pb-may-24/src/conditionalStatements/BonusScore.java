package conditionalStatements;

import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;

        if (points <= 100) {
            bonusPoints = 5;
        } else if (points <= 1000) {
            bonusPoints = (double) points * 20 / 100;
        } else {
            bonusPoints = (double) points * 10 / 100;
        }

        if (points % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        }

        if (points % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }

        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);
    }
}
