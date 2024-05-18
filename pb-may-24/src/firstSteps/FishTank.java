package firstSteps;

import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double occupiedSpace = Double.parseDouble(scanner.nextLine());

        double volume = l * w * h;
        double litters = volume / 1000;

        System.out.println(litters - (litters * occupiedSpace / 100));
    }
}
