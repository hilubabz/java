public class Series {
    static float fact(int a){
        if(a==0 || a==1)
            return 1;
        else   
            return a*fact(a-1);
    }

    public static void main(String[] args) {
        float sum=0;
        for(int i=1;i<=7;i++){
            sum+=(i/fact(i));
        }
        System.out.println("The sum of seven terms in the series is "+sum);
    }
}
