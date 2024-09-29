package forLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double maxPoint = 1250.5;

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        for (int judge = 0; judge < judges; judge++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            points += judgeName.length() * judgePoints / 2;

            if (points >= maxPoint) {
                break;
            }
        }

        if (points >= maxPoint) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                    actor, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, maxPoint - points);
        }
    }
}
