import java.util.Scanner;

public class Task_acmp_263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();

        int dist1 = Math.abs(j - i) - 1;
        int dist2 = n - Math.abs(j - i) - 1;

        if (dist1 > dist2) {
            System.out.println(dist2);
        } else {
            System.out.println(dist1);
        }
    }
}
