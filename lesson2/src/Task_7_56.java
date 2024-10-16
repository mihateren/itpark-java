import java.util.Scanner;

public class Task_7_56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество городов: ");
        int n = in.nextInt();

        double max = -1.0;
        for (int i = 0; i < n; i++) {
            double dist = in.nextDouble();
            if (max < dist) {
                max = dist;
            }
        }

        System.out.println(max);
    }
}
