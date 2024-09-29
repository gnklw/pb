package forLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int currentAge = 1; currentAge <= age; currentAge++) {
            if (currentAge % 2 == 0) {
                sum += 10 * (currentAge / 2) - 1;
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
