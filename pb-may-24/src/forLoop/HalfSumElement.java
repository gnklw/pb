package forLoop;

import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;

            if (maxNum < num) {
                maxNum = num;
            }
        }

        int result = sum - maxNum;

        if (result == maxNum) {
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(result - maxNum));
        }
    }
}
