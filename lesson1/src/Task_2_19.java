import java.util.Scanner;

public class Task_2_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int n0 = n % 10;
        n /= 10;
        int n1 = n % 10;
        n /= 10;
        int n2 = n % 10;
        n /= 10;
        int n3 = n % 10;
        n /= 10;

        int sum = n0 + n1 + n2 + n3;
        int mul = n0 * n1 * n2 * n3;

        System.out.printf("%d %d", sum, mul );

    }
}
