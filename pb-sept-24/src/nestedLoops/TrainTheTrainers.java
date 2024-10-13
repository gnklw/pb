package nestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());

        double totalGradesSum = 0;
        double totalGrades = 0;

        String input;
        while (!"Finish".equals(input = scanner.nextLine())) {
            double grades = 0;
            for (int judge = 0; judge < judges; judge++) {
                ++totalGrades;
                grades += Double.parseDouble(scanner.nextLine());
            }

            totalGradesSum += grades;
            System.out.printf("%s - %.2f.%n", input, grades / judges);
        }

        System.out.printf("Student's final assessment is %.2f.%n", totalGradesSum / totalGrades);
    }
}
