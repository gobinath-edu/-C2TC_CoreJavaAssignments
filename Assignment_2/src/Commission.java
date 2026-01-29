
import java.util.Scanner;

/**
 * Assignment Question 2.2
 * Commission calculation
 */
public class Commission {
    String name, address;
    long phone;
    double salesAmount;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLong();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000)
            commission = salesAmount * 0.10;
        else if (salesAmount >= 50000)
            commission = salesAmount * 0.05;
        else if (salesAmount >= 30000)
            commission = salesAmount * 0.03;
        else
            commission = 0;

        System.out.println("Commission: " + commission);
    }

    public static void main(String[] args) {
        Student s = new Student();
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}
