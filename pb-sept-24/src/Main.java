import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;
        String input = scanner.nextLine();
        while (steps < 10000) {
            if ("Going home".equals(input)) {
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }

            steps += Integer.parseInt(input);
            input = scanner.nextLine();
        }

        int diff = Math.abs(steps - 10000);

        if (steps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", diff);
        } else {
            System.out.printf("%d more steps to reach goal.%n", diff);
        }
    }
}