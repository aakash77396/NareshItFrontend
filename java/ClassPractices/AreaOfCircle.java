package ClassPractices;
public class AreaOfCircle {
    public static void main(String[] args) {
        IO.println("Enter radius: ");
        double r = Double.parseDouble(IO.readln());

        IO.println("Area of circle = " + (3.14*r*r));
    }
}
