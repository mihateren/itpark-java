import java.util.Scanner;

public class Task_5_27_g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 0;

        for (int i = a; i <= b; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}
