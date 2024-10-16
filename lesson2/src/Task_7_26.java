import java.util.Scanner;

public class Task_7_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        for (int i = 0; i < 30; i++) {
            if (in.nextDouble() < 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
