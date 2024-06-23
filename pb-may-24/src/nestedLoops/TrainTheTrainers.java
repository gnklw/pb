package nestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());

        double totalGradesSum = 0;
        double totalGrades = 0;

        String input;
        while (!"finish".equalsIgnoreCase(input = scanner.nextLine())) {

            double grades = 0;
            for (int i = 0; i < judges; i++) {
                ++totalGrades;
                double grade = Double.parseDouble(scanner.nextLine());
                grades += grade;
            }

            totalGradesSum += grades;
            System.out.printf("%s - %.2f.%n", input, grades / judges);
        }

        System.out.printf("Student's final assessment is %.2f.", totalGradesSum / totalGrades);
    }
}
