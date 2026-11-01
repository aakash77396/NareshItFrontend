package lab1;

public class AddWithout {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int carry = (a & b) << 1;
        int sum = (a ^ b) + carry;
        System.out.println(sum);
    }
}
