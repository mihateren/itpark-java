import java.util.Scanner;

public class Task_2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int secondPerHour = 60 * 60;
        int hours = n / secondPerHour;
        int minutes = (n % secondPerHour) / 60;
        int seconds = n % 60;
        System.out.println("часов: " + hours + " минут: " + minutes + " секунд: " + seconds);
    }
}
