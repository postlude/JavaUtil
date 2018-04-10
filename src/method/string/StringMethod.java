package method.string;

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
}
