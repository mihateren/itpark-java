import java.util.Scanner;

public class Task_4_96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double D = b * b - 4 * a * c;
        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("вещественные корни есть: %f %f", root1, root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.printf("вещественный корень один: %f", root);
        } else {
            System.out.println("вещественных корней нет");
        }
    }
}
