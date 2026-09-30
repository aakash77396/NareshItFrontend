package lab1;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        int a=10,b=20;

        a = a+b;
        b= a-b;
        a = a-b;

        IO.println("A = "+ a);
        IO.println("B = "+ b);
    }
}
