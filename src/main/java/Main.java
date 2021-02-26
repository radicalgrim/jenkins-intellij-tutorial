public class Main {

  public static void main(String[] args) {

    String operation = args[0];
    Calculator calculator = new Calculator();
    int num1 = Integer.parseInt(args[1]);

    if (operation.equals("add")) {
      System.out.println(calculator.add(num1, Integer.parseInt(args[2])));
    }
    else if (operation.equals("subtract")) {
      System.out.println(calculator.subtract(num1, Integer.parseInt(args[2])));
    }
    else if (operation.equals("multiply")) {
      System.out.println(calculator.multiply(num1, Integer.parseInt(args[2])));
    }
    else if (operation.equals("divide")) {
      System.out.println(calculator.divide(num1, Integer.parseInt(args[2])));
    }
    else if (operation.equals("fibonacci")) {
      System.out.println(calculator.fibonacciNumberFinder(num1));
    }
    else if (operation.equals("binary")) {
      System.out.println(calculator.intToBinaryNumber(num1));
    }
    else {
      System.out.println("USAGE: <operation> <num1> <num2>");
    }

  }

}
