import java.util.Scanner;

public class Student {
  int roll_no;

  public void setRollNo(int roll_no) {
    this.roll_no = roll_no;
  }

  public void display() {
    System.out.println("The roll no of the student is " + roll_no);
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Roll no of student:");
    int rollNo = scan.nextInt();
    Student s1 = new Student();
    s1.setRollNo(rollNo);
  }
}

class Test extends Student {
  int English_totalMarks, Nepali_totalMarks;

  public void readMarks(int English_totalMarks, int Nepali_totalMarks) {
    this.English_totalMarks = English_totalMarks;
    this.Nepali_totalMarks = Nepali_totalMarks;
  }

  public void display1() {
    System.out.println("Total marks in English is " + English_totalMarks);
    System.out.println("Total marks in Nepali is " + Nepali_totalMarks);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter total marks in English:");
    int english_marks = scan.nextInt();
    System.out.println("Enter total marks in Nepali:");
    int nepali_marks = scan.nextInt();
    Test t1 = new Test();
    t1.readMarks(english_marks, nepali_marks);

  }
}

class Result extends Test {
  int total_marks;

  public void totalcalculate() {
    total_marks = English_totalMarks + Nepali_totalMarks;

  }

  void displaytotal() {
    System.out.println("The total marks of roll no " + roll_no + " is " + total_marks);
  }

  public static void main(String[] args) {

    Result r1 = new Result();
    r1.setRollNo(23);
    r1.display();
    r1.readMarks(122, 222);
    r1.display1();
    r1.totalcalculate();
    r1.displaytotal();

  }
}