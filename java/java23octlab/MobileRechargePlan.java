import java.util.Scanner;
public class MobileRechargePlan {

    public static void displayOperatorName(){
        IO.println("Mobile operator: Airtel");
    }
    public static void displayPlanCode(){
        IO.println("1 Rs. 199");
        IO.println("2 Rs. 299");
        IO.println("3 Rs. 599");
        IO.println("4 Rs. 999");
    }
    public static double getPlanAmount(int planCode){
        if(planCode==1) return 199.0;
        else if(planCode==2) return 299.0;
        else if(planCode==3) return 599.0;
        else if(planCode==4) return 999.0;
        else return 0;
    }

    public static double  calculateDiscount(double amount){
        double dis =0.0;
        if(amount<300) dis =0;
        else if(amount>=300 && amount<600) dis=amount*0.05;
        else if(amount>=600) dis=amount*0.10;
        return dis;
    }
    public static double  calculateFinalAmount(int planCode){
        return getPlanAmount(planCode) - calculateDiscount(getPlanAmount(planCode));
    }
    public static void displayRechargeDetails(int planCode){
        displayOperatorName();
        IO.println("Plan amount: "+getPlanAmount(planCode));
        IO.println("Discount: Rs. "+calculateDiscount(getPlanAmount(planCode)));
    }
    public static void main(String[] args) {
        displayPlanCode();
        Scanner sc = new Scanner(System.in);
        IO.println("Enter Your PlanCode: ");
        int planCode = sc.nextInt();
        displayRechargeDetails(planCode);

    }
}
