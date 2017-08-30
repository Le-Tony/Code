import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromesTest {

	@Test
	public void testPalindromeSentence() {
		assertEquals(true, Palindromes.isPalindromeSentence("Madam, I'm Adam"));
		assertEquals(true, Palindromes.isPalindromeSentence("Never odd or even"));
		assertEquals(false, Palindromes.isPalindromeSentence("Hello World"));
	}
	
	public void testPunctuationAndSpaces(){
		assertEquals(true, Palindromes.isPalindrome("!...!"));
		assertEquals(true, Palindromes.isPalindrome("!....!"));
	}
	
	public void testEmptyString(){
		assertEquals(true, Palindromes.isPalindrome(""));
	}

}
