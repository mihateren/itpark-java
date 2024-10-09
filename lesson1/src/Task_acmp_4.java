import java.util.Scanner;

public class Task_acmp_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = n * 100 + 90 + 9 - n;
        System.out.println(ans);
    }
}
