package conditionalStatements;

import java.util.Scanner;

public class Time15Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        //int addedMin = scanner.nextInt(); - домашно

        min = min + 15;

        if (min >= 60) {
            min = min - 60;
            hour = hour + 1;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
