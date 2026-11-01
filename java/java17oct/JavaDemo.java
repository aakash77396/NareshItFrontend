public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        run();
        walk();
        Animal a1 = new Animal();
        a1.jump();
        System.out.println("Program End");
    }

    public static void run(){
        System.out.println("Bye");
    }

     public static void walk(){
        System.out.println("Hiii");
    }
}

class Animal{
    public void jump(){
        System.out.println("Monkey is jumping");
    }
}