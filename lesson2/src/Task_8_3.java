public class Task_8_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i <= 9; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 10; i <= 50; i += 10) {
            for (int j = 1; j <= i / 10; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i <= 25; i += 5) {
            for (int j = 25; j >= i; j -= 5 ) {
                System.out.print(String.format("%-3d", i));
            }
            System.out.println();
        }
        System.out.println();
    }
}
