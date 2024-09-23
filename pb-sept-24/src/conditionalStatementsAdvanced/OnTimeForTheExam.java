package conditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTimeMin = examHour * 60 + examMin;
        int arrivalTimeMin = arrivalHour * 60 + arrivalMin;

        int diff = examTimeMin - arrivalTimeMin;

        String status;
        if (diff < 0) {
            status = "Late";
        } else if (diff <= 30) {
            status = "On time";
        } else {
            status = "Early";
        }

        System.out.println(status);

        if (diff < 0) {
            diff = Math.abs(diff);
            if (diff >= 60) {
                System.out.printf("%d:%02d hours after the start", diff / 60, diff % 60);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (diff > 0) {
            if (diff >= 60) {
                System.out.printf("%d:%02d hours before the start", diff / 60, diff % 60);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }

        //alt result print
//        if (diff != 0) {
//            String timing = diff > 0 ? "before" : "after";
//            diff = Math.abs(diff);
//            if (diff < 60) {
//                System.out.printf("%d minutes %s the start%n", diff, timing);
//            } else {
//                System.out.printf("%d:%02d hours %s the start%n", diff / 60, diff % 60, timing);
//            }
//        }
    }
}
