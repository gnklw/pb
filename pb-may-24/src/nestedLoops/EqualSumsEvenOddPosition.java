package nestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int num = a; num <= b; num++) {
            String currentNum = String.valueOf(num);
            int oddSum = 0;
            int evenSum = 0;

            for (int i = 0; i < currentNum.length(); i++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentNum.charAt(i)));

                if ((i + 1) % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
