import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (minNum > num) {
                minNum = num;
            }
        }

        System.out.println(minNum);
    }
}