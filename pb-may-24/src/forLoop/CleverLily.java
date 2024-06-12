package forLoop;

import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        double washingMachinePrice = scanner.nextDouble();
        int toyPrice = scanner.nextInt();

        double sum = 0;

        for (int currentAge = 1; currentAge <= age; currentAge++) {
            if (currentAge % 2 == 0) {
                sum += (10 * ((double) currentAge / 2)) - 1;
            } else {
                sum += toyPrice;
            }
        }

        double diff = Math.abs(sum - washingMachinePrice);

        if (sum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
     }
}
