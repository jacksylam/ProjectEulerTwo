import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for ProjectEulerTwo.
 */
public class ProjectEulerTwoTest {
  /**
   * Tests sumOfEvenFibonacci for various upper bounds.
   * @throws Exception Errors if sums are not correct.
   */
  @Test
  public void testSumOfEvenFibonacci() throws Exception {
    assertEquals("sum below 10", 10, ProjectEulerTwo.sumOfEvenFibonacci(10), 0);
    assertEquals("sum below 100", 44, ProjectEulerTwo.sumOfEvenFibonacci(100), 0);
  }
}