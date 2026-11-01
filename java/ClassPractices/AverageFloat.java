package ClassPractices;
public class AverageFloat {
    public static void main(String[] args) {
        IO.println("Enter number: ");
        float a = Float.parseFloat(IO.readln());
        float b = Float.parseFloat(IO.readln());
        float c = Float.parseFloat(IO.readln());

        double avg = (a+b+c)/3;
        IO.println("Average = " + avg);
    }
}
