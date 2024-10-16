import java.util.Scanner;

public class Task_acmp_264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int ans = 0;
        int days = 0;

        for (int i = 0; i < n; i++) {
            days++;
            int temp = in.nextInt();
            if (temp > 0) {
                if (days > ans) {
                    ans = days;
                }
            } else {
                days = 0;
            }
        }

        System.out.println(ans);
    }
}
