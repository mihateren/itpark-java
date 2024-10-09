import java.util.Scanner;


public class Task_acmp_766 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        if (m * n >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
