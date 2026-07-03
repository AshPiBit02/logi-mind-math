
public class Main {
    private static int accumulator = 0;
    private static int multiplier = 13;
    private static int multiplicant = -11;
    private static int count = 5;
    private static int Q_1 = 0;
    private static String comment = "initialize";
    private static int itr = 1;

    public static void main(String[] args) {
        while (count != 0) {
            if (count == 5) {
                header();
                display(0, toBinary(accumulator, 5), toBinary(multiplier, 5), toBinary(Q_1, 1),
                        toBinary(multiplicant, 5), count, comment);
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
            String A_bin = toBinary(accumulator, 5);
            String Q_bin = toBinary(multiplier, 5);
            String Q1_bin = toBinary(Q_1, 1);

            String signBit = A_bin.substring(0, 1); // preserve sign of A
            String combined = signBit + A_bin + Q_bin + Q1_bin; // 12 bits: sign+A+

            comment += " , ARS";
            combined = combined.substring(0, combined.length() - 1);

            String A = combined.substring(0, 5);
            String Q = combined.substring(5, 10);
            String Q1 = combined.substring(10);

            display(itr, A, Q, Q1, toBinary(multiplicant, 5), count, comment);
            accumulator = Integer.parseInt(A, 2);
            multiplier = Integer.parseInt(Q, 2);
            Q_1 = Integer.parseInt(Q1, 2);
            itr++;
            count--;
        }

        String StringAQ = toBinary(accumulator, 5) + toBinary(multiplier, 5);
        int result = Integer.parseInt(StringAQ, 2);
        if (StringAQ.charAt(0) == '1') {
            result -= (1 << StringAQ.length());
        }
        System.out.println("\nResult: " + toBinary(result, StringAQ.length()) + "(bin)  |  " + result + "(dec)");

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

    private static void showResult(String bin, int res) {
        System.out.println("Result:");
        System.out.printf("Bin: %-15s %nInt: %-10d%n", bin, res);
    }

}