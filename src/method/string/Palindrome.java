package method.string;

public class Palindrome {

	public static void main(String[] args) {
		String test1 = "12321";
		String test2 = "123321";
		String test3 = "14441";
		String test4 = "test";
		String test5 = "2";
		String test6 = "22";
		String test7 = "222";
		
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.isPalindrome(test1));
		System.out.println(palindrome.isPalindrome(test2));
		System.out.println(palindrome.isPalindrome(test3));
		System.out.println(palindrome.isPalindrome(test4));
		System.out.println(palindrome.isPalindrome(test5));
		System.out.println(palindrome.isPalindrome(test6));
		System.out.println(palindrome.isPalindrome(test7));
	}

	/**
	 * palindrome check method
	 * @param str
	 * @return palindrome이 맞으면 true, 아니면 false
	 */
	public boolean isPalindrome(String str) {
		char[] charAry = str.toCharArray();
		int lastIndex = str.length() - 1;
		int halfIndex = str.length() / 2;
		
		for(int index=0; index<halfIndex; index++) {
			if(charAry[index] != charAry[lastIndex - index]) {
				return false;
			}
		}
		return true;
	}
}
