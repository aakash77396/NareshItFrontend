public class Butterfly {
    public static void main(String[] args) {
        int star =1;
        int space =8;
        for(int i=1;i<=9;i++){
            // left star
            for(int j=1;j<=star;j++){
                IO.print(" * ");
            }
            // space
            for(int b =1;b<=space;b++){
                System.out.print("   ");
            }
            // right star
            for(int j=1;j<=star;j++){
                IO.print(" * ");
            }
            if(i<=4){
                star++;
                space -=2;
            }else{
                star--;
                space +=2;
            }
            IO.println();
        }
    }
}
