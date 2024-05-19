package conditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSec = Integer.parseInt(scanner.nextLine());
        int secondSec = Integer.parseInt(scanner.nextLine());
        int thirdSec = Integer.parseInt(scanner.nextLine());

        int sumSeconds = firstSec + secondSec + thirdSec;

        int min = sumSeconds / 60;
        int sec = sumSeconds % 60;

        System.out.printf("%d:%02d", min, sec);


//        if (sec < 10) {
//            System.out.printf("%d:0%d", min, sec);
//        } else {
//            System.out.printf("%d:%d", min, sec);
//        }
    }
}
