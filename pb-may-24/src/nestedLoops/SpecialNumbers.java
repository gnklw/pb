package nestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int num = 1111; num <= 9999; num++) {
            String currentNum = String.valueOf(num);
            int count = 0;

            for (int i = 0; i < currentNum.length(); i++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentNum.charAt(i)));

                if (currentDigit == 0) {
                    break;
                }

                if (n % currentDigit == 0) {
                    ++count;
                }
            }

            if (count == currentNum.length()) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
