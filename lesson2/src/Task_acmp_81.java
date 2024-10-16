import java.util.Scanner;

public class Task_acmp_81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int max = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int weight = in.nextInt();
            if (weight > max) {
                max = weight;
            }
            if (weight < min) {
                min = weight;
            }
        }

        System.out.println(min + " " + max);
    }
}
