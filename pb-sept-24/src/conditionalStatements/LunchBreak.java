package conditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String episodeName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunch = (double) breakDuration / 8;
        double rest = (double) breakDuration / 4;

        double total = lunch + rest + episodeDuration;

        boolean hasTime = total <= breakDuration;

        if (hasTime) {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",
                    episodeName, (int) Math.ceil(breakDuration - total));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",
                    episodeName, (int) Math.ceil(total - breakDuration));
        }
    }
}
