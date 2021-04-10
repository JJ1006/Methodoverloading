public class tempp {
  static int methodoverloading(int a, int b) {
    return a + b;
  }
  
  static double methodoverloading(double a, double b) {
    return a + b;
  }
  
  public static void main(String[] args) {
    int myNum1 = methodoverloading(3, 7);
    double myNum2 = methodoverloading(10.3, 17.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
