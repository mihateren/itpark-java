import java.util.Scanner;

public class Task_acmp_233 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean isCrashed = false;

        for (int i = 1; i <= n; i++) {
            int h = in.nextInt();
            if (h <= 437) {
                System.out.println("Crash " + i);
                isCrashed = true;
                break;
            }
        }

        if (!isCrashed) {
            System.out.println("No crash");
        }
    }
}
