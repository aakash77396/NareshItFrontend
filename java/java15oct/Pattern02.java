class pattern02{
    public static void main(String[] args) {
        int star =9;
        int space =0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                IO.print("   ");
            }
            for(int k=1;k<=star;k++){
                IO.print(" * ");
            }
            star-=2;
            space++;
            IO.println();
        }
    }
}