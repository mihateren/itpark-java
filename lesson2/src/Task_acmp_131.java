import java.util.Scanner;

public class Task_acmp_131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int max = -1;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int v, s;
            v = in.nextInt();
            s = in.nextInt();

            if (s == 1 && max < v) {
                max = v;
                ans = i + 1;
            }
        }

        System.out.println(ans);
    }
}
