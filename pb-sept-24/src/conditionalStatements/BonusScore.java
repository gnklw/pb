package conditionalStatements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = scanner.nextInt();

        double bonusPoints;

        if (points <= 100) {
            bonusPoints = 5;
        } else if (points <= 1000) {
            bonusPoints = points * ((double) 20 / 100);
        } else {
            bonusPoints = points * ((double) 10 / 100);
        }

        if (points % 2 == 0) {
            bonusPoints += 1;
        }

        if (points % 10 == 5) {
            bonusPoints += 2;
        }

        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);
    }
}
