package conditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int seats = r * c;

//        double income = 0;

//        switch (type) {
//            case "Premiere" -> income = seats * 12;
//            case "Normal" -> income = seats * 7.5;
//            case "Discount" -> income = seats * 5;
//        }

//        switch (type) {
//            case "Premiere":
//                income = seats * 12;
//                break;
//            case "Normal":
//                income = seats * 7.5;
//                break;
//            case "Discount":
//                income = seats * 5;
//                break;
//        }
//
        double income = switch (type) {
            case "Premiere" -> seats * 12;
            case "Normal" -> seats * 7.5;
            case "Discount" -> seats * 5;
            default -> 0;
        };

//        if ("Premiere".equals(type)) {
//            income = seats * 12;
//        } else if ("Normal".equals(type)) {
//            income = seats * 7.5;
//        } else if ("Discount".equals(type)) {
//            income = seats * 5;
//        }

        System.out.printf("%.2f leva", income);
    }
}
