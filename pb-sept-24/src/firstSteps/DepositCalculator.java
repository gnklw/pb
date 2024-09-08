package firstSteps;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());

//        double rate2 = rate / 100;
//        double amount = deposit * rate2;
//        double perMonth = amount / 12;
//        double result = period * perMonth;
//        double total = result * deposit;

        //ума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        System.out.println(deposit + (((deposit * (rate / 100)) / 12) * period));
//        System.out.println(total);
    }
}
