package forLoop;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num < 200) {
                ++p1;
            } else if (num < 400) {
                ++p2;
            } else if (num < 600) {
                ++p3;
            } else if (num < 800) {
                ++p4;
            } else {
                ++p5;
            }
        }

        System.out.printf("%.2f%%%n", (double) p1 / n * 100);
        System.out.printf("%.2f%%%n", (double) p2 / n * 100);
        System.out.printf("%.2f%%%n", (double) p3 / n * 100);
        System.out.printf("%.2f%%%n", (double) p4 / n * 100);
        System.out.printf("%.2f%%%n", (double) p5 / n * 100);
    }
}
