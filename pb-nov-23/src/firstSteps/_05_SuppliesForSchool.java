package firstSteps;

import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPens = Integer.parseInt(scanner.nextLine());
        int numMarkers = Integer.parseInt(scanner.nextLine());
        int whiteboardCleanerLitters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = numPens * 5.80;
        double markersPrice = numMarkers * 7.20;
        double whiteboardCleanerPrice = whiteboardCleanerLitters * 1.20;

        double sum = pensPrice + markersPrice + whiteboardCleanerPrice;
        double result = sum - (sum * discount / 100);

        System.out.println(result);
    }
}
