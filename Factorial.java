import java.util.*;
public class Factorial {
    static int factorial(int a){
        if(a==0 || a==1)
            return 1;
        else   
            return a*factorial(a-1);
    }
    
    public static void main(String[] args) {
        int a,fact;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number :");
        a=scan.nextInt();
        fact=factorial(a);
        System.out.println("The factorial of "+a+" is "+fact);
    }
}