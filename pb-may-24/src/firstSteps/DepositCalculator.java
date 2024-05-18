package firstSteps;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());

        double ratePerMonth = (deposit * (rate / 100)) / 12;
        double result = deposit + (ratePerMonth * period);

        System.out.println(result);
    }
}
