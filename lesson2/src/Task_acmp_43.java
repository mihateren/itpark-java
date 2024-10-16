import java.util.Scanner;

public class Task_acmp_43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int maxLen = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                counter++;
            } else {
                counter = 0;
            }

            if (counter > maxLen) {
                maxLen = counter;
            }
        }

        System.out.println(maxLen);
    }
}