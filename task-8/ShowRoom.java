import java.util.Scanner;

public class ShowRoom {

    // Instance variables
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    // Default constructor
    public ShowRoom() {
        name = "";
        mobno = 0;
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    // Method to input customer details
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = sc.nextLine();

        System.out.print("Enter mobile number: ");
        mobno = sc.nextLong();

        System.out.print("Enter cost of items purchased: ");
        cost = sc.nextDouble();
    }

    // Method to calculate discount and amount
    public void calculate() {
        if (cost <= 10000) {
            dis = cost * 0.05;  // 5% discount
        } else if (cost > 10000 && cost <= 20000) {
            dis = cost * 0.10;  // 10% discount
        } else if (cost > 20000 && cost <= 35000) {
            dis = cost * 0.15;  // 15% discount
        } else {
            dis = cost * 0.20;  // 20% discount
        }

        // Calculate amount after discount
        amount = cost - dis;
    }

    // Method to display customer details and amount after discount
    public void display() {
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Cost: " + cost);
        System.out.println("Discount: " + dis);
        System.out.println("Amount to be Paid: " + amount);
    }

    // Main method
    public static void main(String[] args) {
        ShowRoom customer = new ShowRoom();
        
        // Input customer details
        customer.input();
        
        // Calculate discount and amount to be paid
        customer.calculate();
        
        // Display customer details and amount to be paid after discount
        customer.display();
    }
}
