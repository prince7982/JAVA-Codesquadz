/*
                            1
                        1   2   1
                    1   2   4   2   1
                1   2   4   8   4   2   1
            1   2   4   8   16  8   4   2   1
        1   2   4   8   16  32  16  8   4   2   1
    1   2   4   8   16  32  64  32  16  8   4   2   1
1   2   4   8   16  32  64  128 64  32  16  8   4   2   1

*/

public class PatternTest5 {
    public static void main(String[] args) {
        int rows = 8;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for triangle alignment
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("    "); // 4 spaces for each indent
            }

            // Print increasing powers of 2
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", num); // width = 4 for even spacing
                num *= 2;
            }

            // Print decreasing powers of 2
            num /= 4; // step back from peak
            for (int j = 0; j < i; j++) {
                System.out.printf("%-4d", num);
                num /= 2;
            }

            System.out.println();
        }
    }
}