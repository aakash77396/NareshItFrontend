class Demo{

    public static void sum(String name, int age){
        System.out.println("Name = "+ name);
        System.out.println("Age = "+ age);
    }

    public static int sqre(int n){
        return n*n;
    }
    public static void main(String[] args) {
        sum("Aakash",23);

        System.out.println(sqre(5));
        System.out.println(sqre(6));
        System.out.println(sqre(7));
        
    }
}