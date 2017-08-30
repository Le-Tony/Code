import java.util.Stack;

public class Palindromes {

	public static boolean isPalindrome(String word) {
		Stack<String> stack = new Stack<String>();
		int length = word.length() -1;
		for(int i = 0 ; i <word.length(); i++)
		{
			if (i > length || i == length)
			{
				break;
			}
			if(word.charAt(i) != word.charAt(length))
			{
				stack.pop();
				return false;
			}
			
			length--;
		}
		stack.push(word);
		return true;
	}
	
	public static boolean isPalindromeSentence(String sentence)
	{
		Stack<String> stack = new Stack<String>();
		if (sentence.length() == 0)
		{
			return true;
		}
		
		sentence = sentence.replaceAll("[^A-Za-z]+", "").toLowerCase();
		int length = sentence.length() -1;
		for(int i = 0; i <sentence.length(); i++)
		{
			if (i >= length)
			{
				break;
			}
			
			if(sentence.charAt(i) != sentence.charAt(length))
			{
				return false;
			}
				
			length--;
		}
		stack.push(sentence);
		return true;
	}
}
