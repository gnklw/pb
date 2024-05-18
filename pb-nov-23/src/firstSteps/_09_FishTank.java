package firstSteps;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double occupiedSpacePercent = Double.parseDouble(scanner.nextLine());

        double volume = l * w * h;
        double litters = volume / 1000;

        double result = litters - (litters * (occupiedSpacePercent / 100));

        System.out.println(result);
    }
}
