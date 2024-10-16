public class Task_5_72 {
    public static void main(String[] args) {
        double startDistance = 10;
        double weekDistance = 0;
        for (int day = 2; day <= 10; day++) {
            startDistance *= 1.1;
            if (day <= 7) {
                weekDistance += startDistance;
            }
        }
        System.out.println(startDistance);
        System.out.println(weekDistance);
    }
}
