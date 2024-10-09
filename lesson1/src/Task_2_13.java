import java.util.Scanner;

public class Task_2_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // окей, циклы не проходили еще
        int n0 = n % 10;
        n /= 10;
        int n1 = n % 10;
        n /= 10;
        int n2 = n % 10;

        System.out.printf("%d%d%d", n0, n1, n2 );

    }
}
