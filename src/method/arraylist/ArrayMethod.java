package method.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayMethod {

	public static void main(String[] args) {
		String[] testStrAry = { "AAA", "BBB", "CCC", "DDD" };

		// 배열 출력
		// [AAA, BBB, CCC, DDD] 형식으로 출력됨
		System.out.println(Arrays.toString(testStrAry));
		
		// 배열을 리스트로 변환
		List<String> testList = Arrays.asList(testStrAry);
		
		// 배열을 모두 같은 값으로 초기화
		Arrays.fill(testStrAry, "fill test");
		System.out.println(Arrays.toString(testStrAry));
	}
	
	
	/**
	 * int 배열 출력 method
	 * @param array
	 */
	public void printArray(int[] array) {
		// 1줄에 1개씩 출력
//		for(int num : array) {
//			System.out.println(num);
//		}
		
		// 1줄에 전부 출력
		for(int num : array) {
			System.out.print(num + " ");
		}
	}
	
	/**
	 * char 배열 출력 method
	 * @param array
	 */
	public void printArray(char[] array) {
		// 1줄에 1개씩 출력
//		for(char ch : array) {
//			System.out.println(ch);
//		}
		
		System.out.println("char ary print");
		// 1줄에 전부 출력
		for(char ch : array) {
			System.out.print(ch + " ");
		}
	}
}
