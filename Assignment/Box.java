public class Box {
    int a,b,c;
    Box(){
        a=10;
        b=20;
        c=1;
    }

    Box(int x){
        a=x;
        b=x;
        c=x;
    }
    Box(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }
    int volume(){
        return (a*b*c);
    }
    public static void main(String[] args) {
        Box a=new Box();
        Box b=new Box(10);
        Box c=new Box(1,2,3);
        System.out.println(a.volume());
        System.out.println(b.volume());
        System.out.println(c.volume());
    }
}