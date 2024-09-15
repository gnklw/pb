package conditionalStatements;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int addedMin = Integer.parseInt(scanner.nextLine()); // homework

        //min = min + 15;
        min += 15;

        if (min >= 60) {
            hour += 1;
            min -= 60;
        }

        if (hour >= 24) {
            hour -= 24;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
