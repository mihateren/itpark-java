import java.util.Scanner;

public class Task_4_97 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max, min;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        int sum = a + b + c;
        int mid = sum - max - min;
        System.out.printf("Максимум: %d, среднее: %d, минимум: %d", max, mid, min);
    }
}
