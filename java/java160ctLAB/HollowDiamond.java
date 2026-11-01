
public class HollowDiamond {
    public static void main(String[] args) {
        int space = 4, star = 1;

        for (int i = 1; i <= 9; i++) {
            for (int b = 1; b <= space; b++) {
                IO.print(" ");
            }

            for (int c = 1; c <= star; c++) {
                if (c == 1 || c == star) {
                    IO.print("* ");
                } else {
                    IO.print("  ");
                }
            }

            if (i <=4) {
                star ++;
                space --;
            } else {
                star --;
                space ++;
            }

            IO.println();
        }
    }
}
