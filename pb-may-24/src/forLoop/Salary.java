package forLoop;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = scanner.nextInt();
        double salary = scanner.nextDouble();

        for (int i = 0; i < tabs; i++) {
            String site = scanner.next();

            switch (site) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.printf("%.2f", salary);
        }
    }
}
