package java2Oct;

public class SwitchNewVersion {
    public static void main(String[] args) {
        int n=1;

        switch (n) {
            case 1 -> {   // not need to write : or break statements. and for multiple statements write into blocks...
                IO.println("Hi");
                IO.println("Bye");
            }
            default -> {
                IO.println("Wow");
                IO.println("Hero");
            }
        }
    }
}
