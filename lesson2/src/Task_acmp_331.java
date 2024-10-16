import java.util.Scanner;

public class Task_acmp_331 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timeString = in.nextLine();
        String[] timeParts = timeString.split(":");

        int hours = 0, minutes = 0;
        hours = Integer.parseInt(timeParts[0]);
        minutes = Integer.parseInt(timeParts[1]);

        int dHours = in.nextInt();
        int dMinutes = in.nextInt();

        int newMinutes = minutes + dMinutes;
        int newHours = hours + dHours;
        minutes = newMinutes % 60;
        hours = (newHours + newMinutes / 60) % 24;

        String ans = String.format("%02d:%02d", hours, minutes);
        System.out.println(ans);

    }
}
