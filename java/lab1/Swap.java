package lab1;

public class Swap {
    public static void main(String[] args) {
        int a=10,b=20;

        int c =a;
        a=b;
        b=c;
        IO.println("A = "+ a);
        IO.println("B = "+ b);
    }
}
