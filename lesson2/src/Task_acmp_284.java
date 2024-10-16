import java.util.Scanner;

public class Task_acmp_284 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] range = new int[2];
        for (int i = 0; i < m; i++) {
            range[0] = in.nextInt();
            range[1] = in.nextInt();
            for (int j = range[0]; j <= range[1]; j++) {
                System.out.print(arr[j-1] + " ");
            }
            System.out.println();
        }
    }
}
