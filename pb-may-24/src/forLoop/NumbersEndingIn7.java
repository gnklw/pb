package forLoop;


public class NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 1000000000; i += 10) {
            System.out.println(i);
        }

        System.out.println(System.currentTimeMillis());
    }
}
