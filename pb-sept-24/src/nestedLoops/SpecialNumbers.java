package nestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1111; currentNum <= 9999; currentNum++) {
            String numAsString = String.valueOf(currentNum);

            int count = 0;
            for (int i = 0; i < numAsString.length(); i++) {
                int currentDigit = numAsString.charAt(i) - '0';

                if (currentDigit == 0) {
                    break;
                }

                if (n % currentDigit == 0) {
                    ++count;
                }
            }

            if (count == numAsString.length()) {
                System.out.print(currentNum + " ");
            }
         }
    }
}
