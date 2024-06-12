package forLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judges; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine()) * judgeName.length() / 2;
            points += judgePoints;

            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
                break;
            }
        }

        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - points);
        }
    }
}
