public class MehodOverloading {
    static void add(){
        System.out.println("The sum is 0");
    }

    static void add(int a){
        System.out.println("The sum is "+a);
    }

    static void add(int a, int b){
        System.out.println("The sum is "+(a+b));
    }
    static void add(double a, double b){
        System.out.println("The sum is "+(a+b));
    }
    public static void main(String[] args) {
        add();
        add(10);
        add(10,20);
        add(1.1,2.2);
    }
}
