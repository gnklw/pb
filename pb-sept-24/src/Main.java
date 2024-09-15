import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String date = scanner.nextLine();

        String text = String.format("Здравейте, %s!%n%nЗапишете се за изпит! Който ще се проведе на %s.", name, date);
        System.out.println(text);
    }
}