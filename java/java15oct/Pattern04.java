
public class Pattern04 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int m = 1; m <= 5; m++) {
                for (int j = 4; j >= m; j--) {
                    IO.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    IO.print(" * ");
                }
                IO.println();
            }
        }
    }
}
