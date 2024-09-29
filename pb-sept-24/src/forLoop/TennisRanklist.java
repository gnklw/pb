package forLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int w = 0;

        for (int tournament = 0; tournament < tournaments; tournament++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "F" -> points += 1200;
                case "SF" -> points += 720;
                case "W" -> {
                    ++w;
                    points += 2000;
                }
            }
        }

        int finalPoints = startPoints + points;
        int averagePoints = points / tournaments;
        double winners = (double) w / tournaments * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%%n", winners);
    }
}
