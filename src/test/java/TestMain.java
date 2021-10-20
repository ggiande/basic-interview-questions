import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestMain {

  @Test
  public void isPalindromeTrue() {
    String word = "racecar";
    assertTrue(Main.isPalindrome(word));
  }

  @Test
  public void isPalindromeFalse() {
    String word = "raceca";
    assertFalse(Main.isPalindrome(word));
  }
}
