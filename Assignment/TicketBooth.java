public class TicketBooth {
    static int noOfPeople,ticket;
    static float totalAmount;

    TicketBooth(){
        noOfPeople++;
    }
    TicketBooth(int x){
        noOfPeople++;
        totalAmount+=x*2.50;
        ticket+=x;
    }
    static void displayPeople(){
        System.out.println("The total number of people visited are "+noOfPeople);
    }
    static void displayTicket(){
        System.out.println("The total number of tickets sold is "+ticket+" and total amount collected is "+totalAmount);
    }
    public static void main(String[] args) {
        TicketBooth a=new TicketBooth();//just visited
        TicketBooth b=new TicketBooth(2);//visit garera duita ticket kinyo
        displayPeople();
        displayTicket();
    }
}             