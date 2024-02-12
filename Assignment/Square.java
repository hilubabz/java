public class Square {
    double l;
    Square(){}
    Square(int x){
        l=x;
    }
    double area(){
        return (l*l);
    }
    double perimeter(){
        return (4*l);
    }

    public static void main(String[] args) {
        double ar,pe;
        Square A=new Square(10);
        ar=A.area();
        pe=A.perimeter();
        System.out.println("The area of square is "+ar+" and perimeter is "+pe);
        Rectangle B=new Rectangle(20,10);
        ar=B.area();
        pe=B.perimeter();
        System.out.println("The area of rectangle is "+ar+" and perimeter is "+pe);
    }
}

class Rectangle extends Square{
    double l,b;
    Rectangle(int x, int y){
        l=x;
        b=y;
    }
    @Override
    double area(){
        return (l*b);
    }

    @Override
    double perimeter(){
        return (2*(l+b));
    }
}