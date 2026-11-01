public class Diamond02 {
    public static void main(String[] args) {
        int star =1;
        int space=4;
        for(int i=1;i<=9;i++){
            for(int a=1;a<=space;a++){
                IO.print("   ");
            }
            for(int b=1;b<=star;b++){
                IO.print(" * ");
            }

            if(i<=4){
                star-=2;
                space++;
            }else{
                star+=2;
                space--;
            }
            IO.println();
        }
    }
}
