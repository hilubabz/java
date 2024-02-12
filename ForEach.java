public class ForEach {
    public static void main(String[] args) {
        int A[]=new int[10];

        for(int i=0;i<10;i++){
            A[i]=7*i;
        }
        for (int i : A) {
            System.out.println(i);
        }
    }
}
