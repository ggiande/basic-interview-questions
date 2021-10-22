import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestPalindrome {

  @Test
  public void isPalindromeTrue() {
    String word = "racecar";
    assertTrue(Palindrome.isPalindrome(word));
  }

  @Test
  public void isPalindromeFalse() {
    String word = "raceca";
    assertFalse(Palindrome.isPalindrome(word));
  }
}
