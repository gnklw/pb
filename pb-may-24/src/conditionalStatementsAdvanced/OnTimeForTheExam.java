package conditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = examHour * 60 + examMinutes;
        int arrivalTimeMinutes = arrivalHour * 60 + arrivalMinutes;

        int diffMinutes = examTimeMinutes - arrivalTimeMinutes;

        String arrivalStatus;
        if (diffMinutes < 0) {
            arrivalStatus = "Late";
        } else if (diffMinutes <= 30) {
            arrivalStatus = "On time";
        } else {
            arrivalStatus = "Early";
        }

        System.out.println(arrivalStatus);

        String arrivalPeriod = diffMinutes > 0 ? "before" : "after";
        diffMinutes = Math.abs(diffMinutes);

        if (diffMinutes < 60) {
            System.out.printf("%d minutes %s the start%n", diffMinutes, arrivalPeriod);
        } else {
            System.out.printf("%d:%02d hours %s the start%n", diffMinutes / 60, diffMinutes % 60, arrivalPeriod);
        }
    }
}
