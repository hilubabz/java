import java.util.*;

public class Small {
    public static void main(String[] args) {
        Small a=new Small();
        Scanner scan = new Scanner(System.in);
        int A[] = new int[3];
        int i;

        for (i = 0; i < 3; i++) {
            System.out.print("A[" + i + "]:");
            A[i] = scan.nextInt();
        }
        a.compare(A);
    }

    void compare(int A[]) {
        int smallest = (A[0] < A[1]) ? (A[0] < A[2] ? A[0] : A[2]) : (A[1] < A[2] ? A[1] : A[2]);
        System.out.println("The smallest number is " + smallest);
        boolean b=false;
        if(b=true)
            smallest=5;
        else   
            System.out.println("Hi");
    }
}
