package conditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double personalTime = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distance / 15) * 12.5;
        // double time = (personalTime * distance) + (Math.floor(distance / 15) * 12.5);
        double time = (personalTime * distance) + delay;

        if (record > time) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - record);
        }
    }
}
