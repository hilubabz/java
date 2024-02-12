import java.util.*;
public class PostiveNegative {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=abc.nextInt();
        cal(a);
    }

    static void cal(int a){
        if(a>0)
            System.out.println("The number is positive");
        else if(a<0)
            System.out.println("The number is negative");
        else
            System.out.println("The number is zero (neither positive nor negative)");
    }
}
