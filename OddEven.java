import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=abc.nextInt();
        cal(a);
    }

    static void cal(int a){
        if(a%2==0)
            System.out.println("The number is even");
        else
            System.out.println("THe number is odd");
    }
}
