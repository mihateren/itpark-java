import java.util.Scanner;
import java.lang.Math;

public class Task_4_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double a = in.nextDouble();

        double CircleArea = Math.PI * r * r;
        double SquareArea = a * a;

        if (CircleArea > SquareArea) {
            System.out.println("круга");
        } else if (CircleArea < SquareArea) {
            System.out.println("квадрата");
        } else {
            System.out.println("равны");
        }

    }
}
