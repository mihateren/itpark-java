import java.util.Scanner;

public class Task_4_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if (b * b - 4 * a * c >= 0) {
            System.out.println("корни есть");
        }
    }
}
