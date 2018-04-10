package method.string;

public class StringMethod {

	public static void main(String[] args) {
		String testStr = "Welcome to the black parade";

		//문자열 거꾸로 출력
		System.out.println(reverseString(testStr));
	}

	/**
	 * 문자열 역순으로 리턴하는 메소드
	 * @param str
	 * @return 역순 문자열
	 */
	public static String reverseString(String str) {
		return (new StringBuffer(str)).reverse().toString();
	}
}
