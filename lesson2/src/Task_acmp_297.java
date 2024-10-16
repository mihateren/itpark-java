import java.util.Scanner;

public class Task_acmp_297 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] circles = {1, 0, 0, 0, 0, 0, 1, 0, 2, 1};
        int ans = 0;

        String num = in.nextLine();
        for (int i = 0; i < num.length(); i++) {
            ans += circles[num.charAt(i) - '0'];
        }

        System.out.println(ans);

    }
}
