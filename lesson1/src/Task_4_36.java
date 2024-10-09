import java.util.Scanner;

public class Task_4_36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();

        int minutes = (int) t;
        if (minutes % 5  < 3) {
            System.out.println("зеленый");
        } else {
            System.out.println("красный");
        }

    }
}
