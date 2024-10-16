import java.util.Scanner;

public class Task_5_28_g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int mul = 1;

        for (int i = a; i <= b; i++) {
            mul *= i;
        }

        System.out.println(mul);
    }
}
