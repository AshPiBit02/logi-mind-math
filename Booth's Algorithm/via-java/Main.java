
public class Main {
    private static int accumulator = 0;
    private static int multiplier = 15;
    private static int multiplicant = -12;
    private static int count = 5;
    private static int Q_1 = 0;
    private static String comment = "initialize";

    public static void main(String[] args) {
        while (count != 0) {
            int Q_0 = multiplier & 1;
            if (Q_0 == 1 && Q_1 == 0) {
                accumulator -= multiplicant;
                comment = "A = A-M";
            } else if (Q_0 == 0 && Q_1 == 1) {
                accumulator += multiplicant;
                comment = "A = A+M";
            } else {
                comment = "A = A";
            }
            int combinedInt = Integer.parseInt(Integer.toBinaryString(accumulator)
                    + Integer.toBinaryString(multiplier) + Integer.toBinaryString(Q_1), 2);
            combinedInt = combinedInt >> 1;
            comment += " , ARS";

            String combined = Integer.toBinaryString(combinedInt);

            String A = combined.substring(0, 5);
            String Q = combined.substring(5, 10);
            String Q1 = combined.substring(10);

            display(A, Q, Q1, Integer.toBinaryString(multiplicant), count, comment);
            accumulator = Integer.parseInt(A, 2);
            multiplier = Integer.parseInt(Q, 2);
            Q_1 = Integer.parseInt(Q1, 2);
            count--;
        }

    }

    private static void display(String A, String Q, String Q_1, String M, int count, String comment) {
        System.out.printf("%-10s %-10s %-5s %-10s %-5d %-10s%n", A, Q, Q_1, M, count, comment);
    }
}