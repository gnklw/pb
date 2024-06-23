package nestedLoops;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                if (num > n) {
                    break;
                }

                System.out.print(num++ + " ");
            }

            if (num > n) {
                break;
            }
            System.out.println();
        }
    }
}
