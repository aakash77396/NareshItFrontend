
import java.util.*;
class Student{
    protected String name;
    protected int rollNumber;

    public Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    public void displayDetails(){
        IO.println("student details");
    }
    public double calculatePercentage(){
        double percentage=0.0;

        return percentage;
    }
}

class ScienceStudent extends Student{
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;

    public ScienceStudent(String name,int rollNumber,int physicsMarks,int chemistryMarks,int mathMarks){
        super(name,rollNumber);
        this.physicsMarks=physicsMarks;
        this.chemistryMarks=chemistryMarks;
        this.mathMarks=mathMarks;
    }

    public double calculatePercentage(){
        double percentage= (this.physicsMarks + this.chemistryMarks + this.mathMarks)/300.0 *100;
        return percentage;
    }
    
    public void displayDetails(){
        IO.println("Science Student Details: ");
        IO.println("Name: "+this.name);
        IO.println("Roll Number: "+this.rollNumber);
        IO.println("Physics Marks: "+this.physicsMarks);
        IO.println("Chemistry Marks: "+this.chemistryMarks);
        IO.println("Math Marks: "+this.mathMarks);
        System.out.printf("Percentage: %.1f%%\n",calculatePercentage());
    }
}

class ArtsStudent extends Student{
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;

    public ArtsStudent(String name,int rollNumber,int historyMarks,int geographyMarks,int englishMarks){
        super(name,rollNumber);
        this.historyMarks=historyMarks;
        this.geographyMarks=geographyMarks;
        this.englishMarks=englishMarks;
    }

    public double calculatePercentage(){
        double percentage= (this.historyMarks + this.geographyMarks + this.englishMarks)/300.0 *100;
        return percentage;
    }

    public void displayDetails(){
        IO.println("Arts Student Details: ");
        IO.println("Name: "+this.name);
        IO.println("Roll Number: "+this.rollNumber);
        IO.println("History Marks: "+this.historyMarks);
        IO.println("Geography Marks: "+this.geographyMarks);
        IO.println("English Marks: "+this.englishMarks);
        System.out.printf("Percentage: %.1f%%\n",calculatePercentage());
    }
}
public class StudentPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String name = sc.nextLine().trim();
            int rollNumber = Integer.parseInt(sc.nextLine().trim());
            int physicsMarks = Integer.parseInt(sc.nextLine().trim());
            int chemistryMarks = Integer.parseInt(sc.nextLine().trim());
            int mathMarks = Integer.parseInt(sc.nextLine().trim());

            if (rollNumber <= 0 ||
                physicsMarks < 0 || physicsMarks > 100 ||
                chemistryMarks < 0 || chemistryMarks > 100 ||
                mathMarks < 0 || mathMarks > 100) {

                IO.println("Error Invalid Input");
                return;
            }

            ScienceStudent ss = new ScienceStudent(
                name,
                rollNumber,
                physicsMarks,
                chemistryMarks,
                mathMarks
            );

            ss.displayDetails();
            IO.println();

            if(sc.hasNextLine()) {

                name = sc.nextLine().trim();

                if(name.length() == 0) {
                    return;
                }

                rollNumber = Integer.parseInt(sc.nextLine().trim());
                int historyMarks = Integer.parseInt(sc.nextLine().trim());
                int geographyMarks = Integer.parseInt(sc.nextLine().trim());
                int englishMarks = Integer.parseInt(sc.nextLine().trim());

                if (rollNumber <= 0 ||
                    historyMarks < 0 || historyMarks > 100 ||
                    geographyMarks < 0 || geographyMarks > 100 ||
                    englishMarks < 0 || englishMarks > 100) {

                    IO.println("Error Invalid Input");
                    return;
                }

                ArtsStudent as = new ArtsStudent(
                    name,
                    rollNumber,
                    historyMarks,
                    geographyMarks,
                    englishMarks
                );

                as.displayDetails();
            }

        } catch (Exception e) {
            IO.println("Error Invalid Input");
        }

        sc.close();
    }
}