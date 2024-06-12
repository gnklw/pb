package forLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = scanner.nextInt();
        int startPoints = scanner.nextInt();

        int points = 0;
        int w = 0;

        for (int tournament = 0; tournament < tournaments; tournament++) {
            String stage = scanner.next();

            switch (stage) {
                case "W" -> {
                    points += 2000;
                    ++w;
                }
                case "F" -> points += 1200;
                case "SF" -> points += 720;
            }
        }

        System.out.printf("Final points: %d%n", startPoints + points);
        System.out.printf("Average points: %.0f%n", Math.floor((double) points / tournaments));
        System.out.printf("%.2f%%%n", (double) w / tournaments * 100);
    }
}
