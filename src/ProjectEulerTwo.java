/**
 * Created by Jack on 2/1/2015.
 *
 * Solves ProjectEulerTwo.
 */
public class ProjectEulerTwo {
  /**
   * Computes sum of even Fibonacci numbers less than 4000000.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    double sum = sumOfEvenFibonacci(4000000);

    System.out.println(sum);
  }

  /**
   * Computes sum of even Fibonacci numbers less than some upper bound.
   * @param upperBound The upper bound.
   * @return Sum of even Fibonacci numbers.
   */
  public static double sumOfEvenFibonacci(int upperBound) {
    double first = 1;
    double second = 1;
    double newNum;
    double sum = 0;

    while (true) {
      if (first > upperBound) {
        break;
      }
      //check if first is even, add to sum if it is.
      if (first % 2 == 0) {
        sum += first;
      }
      newNum = first + second;
      first = second;
      second = newNum;
    }
    return sum;
  }
}
