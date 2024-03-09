

 import java.util.*;

 public class Main {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 Calculator calculator = new Calculator();

 while (true) {
 try {
 System.out.println("Calculator Menu:");
 System.out.println("1. Addition");
 System.out.println("2. Subtraction");
 System.out.println("3. Multiplication");
 System.out.println("4. Division");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 int choice = scan.nextInt();

 switch (choice) {
 case 1:
 calculator.addition();
 break;
 case 2:
 calculator.subtraction();
 break;
 case 3:
 calculator.multiplication();
 break;
 case 4:
 calculator.division();
 break;
 case 5:
 System.out.println("Exited");
 scan.close();
 System.exit(0);
 default:
 // throw keyword: creating exception object explicitly
 throw new IllegalArgumentException("Invalid choice");
 }
 } catch (InputMismatchException e) {
 System.out.println("Please enter a valid integer choice.");
 scan.next(); // taking correct input
 } catch (ArithmeticException | IllegalArgumentException e) {
 System.out.println("An error occurred: " + e.getMessage());
 }
 }
 }
 }
53
