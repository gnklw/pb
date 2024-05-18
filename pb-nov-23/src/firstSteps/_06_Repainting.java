package firstSteps;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nylon = Integer.parseInt(sc.nextLine()) + 2;
        int paint = Integer.parseInt(sc.nextLine());
        int paintThinner = Integer.parseInt(sc.nextLine());
        int workHours = Integer.parseInt(sc.nextLine());

        double nylonPrice = nylon * 1.5;
        double paintPrice = paint * 14.5;
        paintPrice = paintPrice + (paintPrice * 10 / 100);
        double paintThinnerPrice = paintThinner * 5;

        double materials = nylonPrice + paintPrice + paintThinnerPrice + 0.4;
        double workers = workHours * (materials * 30 / 100);

        double sum = materials + workers;

        System.out.println(sum);
    }
}
