package conditionalStatements;

import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String episode = scanner.nextLine();
        int episodeDuration = scanner.nextInt();
        int breakDuration = scanner.nextInt();

        double lunchDuration = (double) breakDuration / 8;
        double leisureDuration = (double) breakDuration / 4;

        double freeTime = breakDuration - (lunchDuration + leisureDuration);

        if (freeTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    episode, Math.ceil(freeTime - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    episode, Math.ceil(episodeDuration - freeTime));
        }
    }
}
