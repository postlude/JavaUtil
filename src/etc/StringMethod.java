package etc;

public class StringMethod {

	public static void main(String[] args) {
		StringMethod stringMethod = new StringMethod();
		
		
		String testStr = "Welcome to the black parade";

		//문자열 거꾸로 출력
		System.out.println(stringMethod.reverseString(testStr));
	}

	/**
	 * 문자열 역순으로 리턴하는 메소드
	 * @param str
	 * @return 역순 문자열
	 */
	public String reverseString(String str) {
		return (new StringBuffer(str)).reverse().toString();
	}
	
	
	/**
	 * 모음(혹은 자음) 개수 세는 메소드
	 * @param 문자열
	 * @return 모음(혹은 자음) 개수
	 */
	public int countVowel(String str) {
		// 모음 개수
		int vowelNum = 0;
		// 자음 개수
		int consonantNum = 0;
		
		for(char letter : str.toCharArray()) {
			if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u') {
				vowelNum++;
			}else {
				consonantNum++;
			}
		}
		
		return vowelNum;
	}
}
