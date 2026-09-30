public class MaxTernery {
    public static void main(String[] args) {
        int a= 10,b=30,c=40;
        int res = (a>b && a>c) ? a: (b>c) ? b : c;
        IO.println(res);
    }
}
