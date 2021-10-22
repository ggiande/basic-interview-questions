import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

  @Test
  public void testFibonacciSequence() {
    int targetNumber = 2;
    int expectedValue = 1;
    assertEquals(expectedValue, Fibonacci.fibonacciSequence(targetNumber));
  }
}
