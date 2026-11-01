
public class pattern01 {

    public static void main(String[] args) {
        int star=1;
        int space=4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=space; j++) {
                IO.print("   ");

            }
            for (int k = 1; k <= star; k++) {
                IO.print(" * ");
            }
            space--;
            star +=2;
            IO.println();

        }

       
    }
}
