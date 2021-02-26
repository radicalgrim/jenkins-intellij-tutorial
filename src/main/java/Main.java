import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Welcome to the calculator!!\n");
    Calculator calculator = new Calculator();
    String operation = "";

    while (!operation.equals("exit")) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter an operation:");
      operation = in.nextLine();
      System.out.println("Enter an operand:");
      int num1 = in.nextInt();

      if (operation.equals("add")) {
        System.out.println("Enter a second operand:");
        int num2 = in.nextInt();
        System.out.println("Answer:");
        System.out.println(calculator.add(num1, num2));
        System.out.println("\n");
      }
      else if (operation.equals("subtract")) {
        System.out.println("Enter a second operand:");
        int num2 = in.nextInt();
        System.out.println("Answer:");
        System.out.println(calculator.subtract(num1, num2));
        System.out.println("\n");
      }
      else if (operation.equals("multiply")) {
        System.out.println("Enter a second operand:");
        int num2 = in.nextInt();
        System.out.println("Answer:");
        System.out.println(calculator.multiply(num1, num2));
        System.out.println("\n");
      }
      else if (operation.equals("divide")) {
        System.out.println("Enter a second operand:");
        int num2 = in.nextInt();
        System.out.println("Answer:");
        System.out.println(calculator.divide(num1, num2));
        System.out.println("\n");
      }
      else if (operation.equals("fibonacci")) {
        System.out.println("Answer:");
        System.out.println(calculator.fibonacciNumberFinder(num1));
        System.out.println("\n");
      }
      else if (operation.equals("binary")) {
        System.out.println("Answer:");
        System.out.println(calculator.intToBinaryNumber(num1));
        System.out.println("\n");
      }
      else if (operation.equals("exit")) {
        return;
      }
      else {
        System.out.println("USAGE: <operation> <num1> <num2>");
      }
    }

  }

}
