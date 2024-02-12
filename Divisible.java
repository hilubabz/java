public class Divisible {
    public static void main(String[] args) {
        int i,count=0,sum=0;
        for(i=101;i<200;i++){
            if(i%7==0 && i%5!=0){
                count++;
                sum+=i;
            }
        }
        System.out.println("There are a total of "+count+" numbers divisible by 7 but not by 5 between 100 and 200 and their sum is "+sum);
    }
}
