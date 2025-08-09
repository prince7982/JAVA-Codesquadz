/*

1                           1
1 2                       2 1
1 2 3                   3 2 1
1 2 3 4               4 3 2 1
1 2 3 4 5           5 4 3 2 1
1 2 3 4 5 6       6 5 4 3 2 1
1 2 3 4 5 6 7   7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1

*/

public class PatternTest3 {
    public static void main(String[] args) {
        int n = 8; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            // Left increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Middle spaces
            for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print("  ");
            }
            
            // Right decreasing numbers
            // For the last line, we start from i-1, otherwise from i
            int start = (i == n) ? i - 1 : i;
            for (int l = start; l >= 1; l--) {
                System.out.print(l + " ");
            }
            
            System.out.println();
        }
    }
}