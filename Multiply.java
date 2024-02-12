import java.util.*;
public class Multiply {
    static void mul(int a){
        for(int i=1;i<=10;i++)
            System.out.println(a+"*"+i+"="+(a*i));
    }

    public static void main(String[] args) {
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number :");
        a=scan.nextInt();
        mul(a);
        scan.close();
    }
}
