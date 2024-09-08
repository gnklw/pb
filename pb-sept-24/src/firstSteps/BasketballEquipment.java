package firstSteps;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double shoes = fee - (fee * ((double) 40 / 100));
        double uniform = shoes - (shoes * ((double) 20 / 100));
        double basketball = uniform / 4;
        double acc = basketball / 5;

        double sum = shoes + uniform + basketball + acc + fee;

        System.out.println(sum);
    }
}
