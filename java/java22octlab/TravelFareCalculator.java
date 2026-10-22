import java.util.Scanner;

public class TravelFareCalculator {
    public static void displayTravelAgencyName(){
        IO.println("Aakash Agency");
    }
    public static double calculateBaseFare(int distance){
        double fare=0.0;
        if(distance<=100){
            fare = 300;
        }else if(distance>100 && distance<=300){
            fare = 600;
        }else if(distance>300){
            fare = 1000;
        }
        return fare;
    }
    public static double calculateDiscount(double baseFare, int age){
        double discount=0.0;
        if(age<5) discount = baseFare*0.5;
        else if(age>=5 && age<=59) discount = 0;
        else if(age>=60) discount = baseFare*0.3;
        return discount;
    }
    public static double calculateFinalFare(int distance, int age){
        double baseFare = calculateBaseFare(distance);
        return baseFare - calculateDiscount(baseFare, age);
    }
    public static void displayTicket(int distance, int age){
        IO.println("Travel distance: "+ distance + " km");
        IO.println("Passenger age: "+ age);
        IO.println("Base fare: Rs. "+ calculateBaseFare(distance));
        IO.println("Discount: Rs. "+ calculateDiscount(calculateBaseFare(distance), age));
        IO.println("Final fare: Rs. "+ (calculateBaseFare(distance) - calculateDiscount(calculateBaseFare(distance), age)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter travel distance: ");
        int distance = sc.nextInt();

        IO.println("Enter passenger age: ");
        int age = sc.nextInt();

        displayTicket(distance, age);
    }
}
