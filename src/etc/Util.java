package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Util {

	public static void main(String[] args) {
		// ==================================================
		String[] ary = { "AAA", "BBB", "CCC", "DDD" };

		// 배열 -> 리스트
		List<String> list = Arrays.asList(ary);
		
		// 배열을 모두 같은 값으로 초기화
		Arrays.fill(ary, "fill test");
		Print.printAry(ary, true);
		
		// ==================================================
		
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int index=0; index<4; index++) {
			list2.add(index);
		}
		
		// 리스트 뒤집기
		// 파라미터로 사용한  원본 collection 순서가 뒤집어짐
		Collections.reverse(list2);
		Print.printList(list2, true);

		// 리스트 -> 배열
		Integer[] testStrAry = list2.toArray(new Integer[0]);
		System.out.println(testStrAry.length);
		Print.printAry(testStrAry, true);
	}

	/**
	 * Combination(nCr) 계산 메소드
	 * @param n
	 * @param r
	 * @return nCr 계산 결과 값 
	 */
	public int calcCombination(int n, int r) {
		if(n==r || r==0) {
			return 1;
		} else {
			return calcCombination(n-1, r-1) + calcCombination(n-1, r);
		}
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
	
	/**
	 * 진법 변환 메소드. 10이 넘어가는 수는 알파벳 대문자 A부터 시작
	 * @param system - 진법
	 * @param num - 변환할 수
	 * @return system 진법으로 변환한 문자열
	 */
	public String convertSystem(int system, int num) {
		switch(system) {
			case 2 : {
				return Integer.toBinaryString(num);
			}
			case 8 : {
				return Integer.toOctalString(num);
			}
			case 16 : {
				return Integer.toHexString(num).toUpperCase();
			}
			default : {
				StringBuilder sb = new StringBuilder();
				Stack<Integer> stack = new Stack<>();
				
				while(num >= system) {
					int mod = num % system;
					stack.push(mod);
					num /= system;
				}
				stack.push(num);
				
				while(!stack.isEmpty()) {
					int mod = stack.pop();
					
					if(mod >= 10) {
						char appendCh = (char)(55 + mod);
						sb.append(appendCh);
					}else {
						sb.append(mod);
					}
				}
				
				return sb.toString();
			}
		}
	}
	
	/**
	 * num 이하의 모든 소수를 구하는 메소드
	 * @param num
	 * @return primeNumList
	 */
	public ArrayList<Integer> everyPrimeNum(int num) {
		ArrayList<Integer> primeNumList = new ArrayList<Integer>();
		boolean[] check = new boolean[num+1];
		
		for (int i=2; i<=num; i++) {
			if (!check[i]) {
				// 소수에 추가하고
				primeNumList.add(i);
				// 추가한 소수의 배수들은 전부 소수에서 제외
				for (int j=i*2; j<=num; j+=i) {
					check[j] = true;
				}
			}
		}
		
		return primeNumList;
	}
	
	/**
	 * 소수인지 아닌지 판별하는 메소드
	 * @param num
	 * @return true / false
	 */
	public boolean isPrime(int num) {
		// 1은 소수가 아니다.
		if (num <= 1) {
			return false;
		}

		// 짝수
		if ((num & 1) == 0) {
			return (num == 2); // 2이면 true 아니면 소수 아님
		}

		for (int checkNum = 3; checkNum * checkNum <= num; checkNum++) { // i = 3 ~ sqrt(n) 까지의 홀수
			if (num % checkNum == 0) {// i가 n의 약수라면
				return false; // 약수존재(소수 아님)
			}
		}

		return true;
	}
}
