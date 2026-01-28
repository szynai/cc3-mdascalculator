package calcu;
import java.util.Scanner;

public class calculatormain {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + Addition.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + Subtraction.subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + Multiplication.multiply(a, b));
                break;
            case 4:
                System.out.println("Result: " + Division.divide(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    } 
}
