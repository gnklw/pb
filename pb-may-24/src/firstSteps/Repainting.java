package firstSteps;

import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine()) + 2;
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = nylon * 1.50;
        double paintPrice = paint * 14.5;
        paintPrice = paintPrice + (paintPrice * 10 / 100);
        double paintThinnerPrice = paintThinner * 5;

        double materials = nylonPrice + paintPrice + paintThinnerPrice + 0.4;
        double workers = workHours * (materials * 30 / 100);

        double sum = materials + workers;
        System.out.println(sum);
    }
}
