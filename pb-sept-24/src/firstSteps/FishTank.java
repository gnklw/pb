package firstSteps;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double occupiedSpice = Double.parseDouble(scanner.nextLine());

        double volume = l * w * h;
        double litters = volume / 1000;

        double result = litters - (litters * (occupiedSpice / 100)) ;

        System.out.println(result);
    }
}
