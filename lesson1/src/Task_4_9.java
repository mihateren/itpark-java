import java.util.Scanner;

public class Task_4_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v1 = in.nextDouble();
        double v2 = in.nextDouble();

        double newV2 = v2 * 1000 / 3600;

        if (v1 > newV2) {
            System.out.println(v1);
        } else if (v1 < newV2) {
            System.out.println(newV2);
        } else {
            System.out.println("равны");
        }

    }
}
