package firstSteps;

import java.util.Scanner;

public class _08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualBasketballFee = Integer.parseInt(scanner.nextLine());

        double basketballShoes = annualBasketballFee - (annualBasketballFee * 40 / 100.0);
        double basketballUniform = basketballShoes - (basketballShoes * 20 / 100);
        double basketball = basketballUniform / 4;
        double basketballAccessories = basketball / 5;

        double sum = basketballShoes + basketballUniform + basketball
                + basketballAccessories + annualBasketballFee;

        System.out.println(sum);
    }
}
