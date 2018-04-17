package combination;

public class Combination {
	public static void main(String[] args) {
		Combination combination = new Combination();
		
		System.out.println(combination.calcCombination(15, 7));
	}
	
	/**
	 * nCr 계산하는 메소드
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
}
