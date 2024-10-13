package nestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int currentNum = a; currentNum <= b; currentNum++) {
            String numAsString = String.valueOf(currentNum);

            int evenSum = 0;
            int oddSum = 0;

            for (int i = 0; i < numAsString.length(); i++) {
                //int currentDigit = Integer.parseInt(String.valueOf(numAsString.charAt(i)));
                int currentDigit = Character.getNumericValue(numAsString.charAt(i));

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
