public class Calculator {
    public Calculator() {
        // Initializes the object of the class //
        // Could be omitted and replaced by a default one //
    }
  
    // Calculation methods //
  
    public int add(int a, int b) {
      return a + b;
    }
  
      public int substract(int a, int b) {
      return a - b;
    }
  
      public int multiply(int a, int b) {
      return a * b;
    }
  
    // The divide method takes doubles instead of ints as parameters, otherwise the result is incorrect //
  
      public double divide(double a, double b) {
      return a / b;
    }
        public int modulo(int a, int b) {
      return a % b;
    }
  
  
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
  
      // Change the method and the arguments here //
      System.out.println("Your result is:");
      System.out.println(myCalculator.add(2,11));
      System.out.println("Note: To try another calculation, you can change the method called and its arguments in the code line 39.");
    }
  
  }