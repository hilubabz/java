public class Book {
    int bookId;
    int pages;
    public Book(){
        bookId=1;
        pages=10;
    }

    public Book(int a, int b){
        bookId=a;
        pages=b;
    }

    public static void main(String[] args) {
        FictionBooks a=new FictionBooks();
        FictionBooks b=new FictionBooks("Pukar");
        a.display();
        b.display();
    }
}

class FictionBooks extends Book{
    String name;
    public FictionBooks(){
        name="Hello";
    }

    public FictionBooks(String a){
        super(10,20);
        name=a;
    }

    void display(){
        System.out.println("Book name: "+name+" Book ID: "+bookId+" Pages: "+pages);
    }
}