package java30;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        double r,h;
        Scanner sc = new Scanner(System.in);
        IO.println("Enter Cylinder l and h: ");
        r= sc.nextDouble();
        h= sc.nextDouble();
        IO.println("Volume of Cylinder = " +((3.14)*r*r*h));
    }
}
