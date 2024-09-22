package conditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if (b == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", a);
        } else {
            double result = switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> (double) a / b;
                case "%" -> a % b;
                default -> 0;
            };

            switch (operator) {
                case "+", "-", "*" -> System.out.printf("%d %s %d = %d - %s", a, operator, b, (int) result, result % 2 == 0 ? "even" : "odd");
                case "/" -> System.out.printf("%d %s %d = %.2f", a, operator, b, result);
                case "%" -> System.out.printf("%d %s %d = %d", a, operator, b, (int) result);
            }
        }
    }
}
