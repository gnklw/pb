package firstSteps;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int whiteboardCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.8;
        double markersPrice = markers * 7.2;
        double whiteboardCleanerPrice = whiteboardCleaner * 1.2;

        double sum = pensPrice + markersPrice + whiteboardCleanerPrice;

        System.out.println(sum - (sum * discount / 100));
    }
}
