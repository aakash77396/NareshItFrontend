public class Pattern3 {
    public static void main(String[] args) {
        /*
        A  E  I  M
        B  F  J  N
        C  G  K  O
        D  H  L  P
        */
       for (char i = 'A'; i <= 'D'; i++) {
            char n=i;
            for(char j='A';j<='D';j++){
                System.out.printf("%4c",n);
                n+=4;
            }
            IO.println();
        }
    }
}
