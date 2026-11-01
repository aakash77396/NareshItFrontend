public class Pattern04 {
    public static void main(String[] args) {
        /*

                  *
                *   *
              *   *   *
            *   *   *   *
          *   *   *   *   *

        */
        int r=5,c=9;
        int star=1,space=4;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                for(int k=1;k<=space;k++){
                    IO.print(" ");
                }
                for(int m=1;m<=star;m++){
                    IO.print(" * ");
                }
                star++;
                IO.println();
            }
        }
    }
}
