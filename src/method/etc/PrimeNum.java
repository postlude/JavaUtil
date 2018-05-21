package method.etc;

import java.util.ArrayList;
import java.util.List;

public class PrimeNum {

	public static void main(String[] args) {
		// num 이하의 모든 소수들
		int num = 100;
		List<Integer> primeNum = new ArrayList<Integer>();
		boolean[] check = new boolean[num+1];
		
		for (int i=2; i<=num; i++) {
			if (!check[i]) {
				// 소수에 추가하고
				primeNum.add(i);
				// 추가한 소수의 배수들은 전부 소수에서 제외
				for (int j=i*2; j<=num; j+=i) {
					check[j] = true;
				}
			}
		}
	}

	/**
	 * 소수인지 아닌지 판별하는 메소드
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPrime(int num) {
		// 1은 소수가 아니다.
		if (num <= 1) {
			return false;
		}

		// 짝수
		if ((num & 1) == 0) {
			return (num == 2); // 2이면 true 아니면 소수아니다
		}

		for (int checkNum = 3; checkNum * checkNum <= num; checkNum++) { // i = 3 ~ sqrt(n) 까지의 홀수
			if (num % checkNum == 0) {// i가 n의 약수라면
				return false; // 약수존재. 소수아니다.
			}
		}

		return true;
	}
}
