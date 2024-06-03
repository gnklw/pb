package conditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();

        if (b == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", b);
        } else {
            double result = switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "/" -> (double) a / b;
                case "%" -> a % b;
                case "*" -> a * b;
                default -> 0;
            };

            switch (operator) {
                case "+", "-", "*" -> System.out.printf("%d %s %d = %.0f - %s",
                        a, operator, b, result, result % 2 == 0 ? "even" : "odd");
                case "/" -> System.out.printf("%d / %d = %.2f", a, b, result);
                case "%" -> System.out.printf("%d %% %d = %.0f", a, b, result);
            }
        }
    }
}
