import java.util.*;
 
 import java.util.Scanner;
 
 public class Calculator {
 
 Scanner scan = new Scanner(System.in);
 
 // Addition
 public void addition() {
 try {
 System.out.print("Enter first number: ");
 double num1 = scan.nextDouble();
 System.out.print("Enter second number: ");
 double num2 = scan.nextDouble();
 double res = num1 + num2;
 System.out.println("Result: " + res);
 } catch (InputMismatchException e) {
 System.out.println("Invalid input! Please enter valid numbers.");
 scan.nextLine();
 }
 }
 
 // Subtraction
 public void subtraction() {
 try {
 System.out.print("Enter first number: ");
 double num1 = scan.nextDouble();
 System.out.print("Enter second number: ");
 double num2 = scan.nextDouble();
 double res = num1 - num2;
 System.out.println("Result: " + res);
 } catch (InputMismatchException e) {
 System.out.println("Please enter valid numbers.");
 scan.nextLine();
 }
 }
 
 // Multiplication
 public void multiplication() {
 try {
 System.out.print("Enter first number: ");
 double num1 = scan.nextDouble();
 System.out.print("Enter second number: ");
 double num2 = scan.nextDouble();
 double res = num1 * num2;
 System.out.println("Result: " + res);
 } catch (InputMismatchException e) {
 System.out.println("Please enter valid numbers.");
 scan.nextLine();
 }
 }
 
 // Division
 public void division() {
 try {
 System.out.print("Enter dividend: ");
 double dividend = scan.nextDouble();
 System.out.print("Enter divisor: ");
 double divisor = scan.nextDouble();
 if (divisor == 0) {
 throw new ArithmeticException("Cannot divide by zero.");
 }
 double res = dividend / divisor;
 System.out.println("Result: " + res);
 } catch (InputMismatchException e) {
 System.out.println("Please enter valid numbers.");
 scan.nextLine();
 }
}