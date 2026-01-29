
import java.util.Scanner;

/**
 * Assignment Question 2.3
 * Circle class
 */
public class Circle {
    double radius;
    String colour;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter Colour: ");
        colour = sc.next();
    }

    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
