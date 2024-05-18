package firstSteps;

import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualBasketballFee = Integer.parseInt(scanner.nextLine());

        double shoes = annualBasketballFee - ((double) annualBasketballFee * 40 / 100);
        double uniform = shoes - (shoes * 20 / 100);
        double basketball = uniform / 4;
        double acc = basketball / 5;

        double sum = annualBasketballFee + shoes + uniform + basketball + acc;

        System.out.println(sum);
    }
}
