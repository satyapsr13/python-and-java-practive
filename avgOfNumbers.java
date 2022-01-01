/**
 * avgOfNumbers
 */
public class avgOfNumbers {

  public static void main(String[] args) {
    double[] arr = { 12.2, 510.0 };
    double sum = 0;
    for (double it : arr) {
      sum += it;
    }
    System.out.format("average is : %.3f", sum);
  }
}
