public class Task_8_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("5 ");
            }
            System.out.println();
        }

        System.out.println( );
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(String.format("%d ", j));
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 41; i <= 71; i += 10) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(String.format("%d ", i + j));
            }
            System.out.println();
        }
    }
}
