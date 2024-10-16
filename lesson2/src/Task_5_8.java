public class Task_5_8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String s = "";
            if (i == 1) {
                s = String.format("%d фунт = %d г", i, i * 453);
            } else if (i >= 2 && i <= 4) {
                s = String.format("%d фунта = %d г", i, i * 453);
            } else {
                s = String.format("%d фунтов = %d г", i, i * 453);
            }
            System.out.println(s);
        }
    }
}
