import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests ProjectEulerTwo for correctness.
 */
public class ProjectEulerTwoTest {

  /**
   * Tests sumOfEvenFibonnaci with various upper bounds.
   * @throws Exception Error if sums are not correct.
   */
  @Test
  public void testSumOfEvenFibonacci() throws Exception {
    assertEquals("testing below 10", 10, ProjectEulerTwo.sumOfEvenFibonacci(10), 0);
    assertEquals("testing below 90", 44, ProjectEulerTwo.sumOfEvenFibonacci(90), 0);
  }
}