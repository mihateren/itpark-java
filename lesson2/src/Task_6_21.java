import java.util.Scanner;

public class Task_6_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1;
        int b = 1;

        while (b <= n) {
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println("первое число большее n: " + b);

        int sum = a + b;
        while (sum <= 1000) {
            int temp = b;
            b += a;
            a = temp;
            sum += b;
        }
        System.out.println("сумма чисел не превышающих 1000: " + (sum - b));

    }
}
