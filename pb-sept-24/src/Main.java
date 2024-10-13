import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sym = '1';

        System.out.println(Character.getNumericValue(sym));
        System.out.println(Character.valueOf(sym));
        System.out.println((int) sym - '0');
    }
}