import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    private static int accumulator;
    private static int multiplier;
    private static int multiplicant;
    private static int count;
    private static int Q_1 = 0;
    private static String comment = "initialize";
    private static int itr = 1;
    private static int width;

    public static void main(String[] args) {

        inputData();
        width = Math.max(minBits(multiplier), minBits(multiplicant));
        count = width;
        while (count != 0) {
            if (count == 5) {
                header();
                display(0, toBinary(accumulator, width), toBinary(multiplier, width), toBinary(Q_1, 1),
                        toBinary(multiplicant, width), count, comment);
            }
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
            String A_bin = toBinary(accumulator, width);
            String Q_bin = toBinary(multiplier, width);
            String Q1_bin = toBinary(Q_1, 1);

            String signBit = A_bin.substring(0, 1);
            String combined = signBit + A_bin + Q_bin + Q1_bin;

            comment += " , ARS";
            combined = combined.substring(0, combined.length() - 1);

            String A = combined.substring(0, width);
            String Q = combined.substring(width, 2 * width);
            String Q1 = combined.substring(2 * width);

            display(itr, A, Q, Q1, toBinary(multiplicant, width), count, comment);
            accumulator = Integer.parseInt(A, 2);
            multiplier = Integer.parseInt(Q, 2);
            Q_1 = Integer.parseInt(Q1, 2);
            itr++;
            count--;
        }

        String StringAQ = toBinary(accumulator, width) + toBinary(multiplier, width);
        int result = Integer.parseInt(StringAQ, 2);
        if (StringAQ.charAt(0) == '1') {
            result -= (1 << StringAQ.length());
        }
        System.out.println("\nResult: " + toBinary(result, StringAQ.length()) + "(bin)  |  " + result + "(dec)");

    }

    private static void inputData() {

        System.out.printf("Enter multiplier: ");
        multiplier = Integer.parseInt(sc.nextLine());
        System.out.printf("Enter Multiplicand: ");
        multiplicant = Integer.parseInt(sc.nextLine());
    }

    private static int minBits(int n) {
        if (n == 0)
            return 1;
        if (n > 0)
            return 32 - Integer.numberOfLeadingZeros(n) + 1; // +1 for sign bit
        return 32 - Integer.numberOfLeadingZeros(~n) + 1; // magnitude of ~n, +1 sign bit
    }

    private static String toBinary(int value, int width) {
        String s = Integer.toBinaryString(value & ((1 << width) - 1));
        return String.format("%" + width + "s", s).replace(' ', '0');
    }

    private static void display(int itr, String A, String Q, String Q_1, String M, int count, String comment) {
        System.out.printf("%-10d %-15s %-15s %-10s %-18s %-10d %-15s%n", itr, A, Q, Q_1, M, count, comment);
    }

    private static void header() {
        System.out.printf("%-10s %-15s %-15s %-10s %-18s %-10s %-15s%n", "Iteration", "Accumulator(A)", "Multiplier(Q)",
                "Q_1",
                "Multiplicand(M)", "Count", "Comment");

        System.out.println("-".repeat(100));
    }
}