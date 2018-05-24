package method.etc;

public class LowerUpperBound {

	public static void main(String[] args) {
		LowerUpperBound lub = new LowerUpperBound();
		
		int[] ary = {1, 2, 2, 2, 3};
		System.out.println(lub.calcLowerBound(ary, 1));
		System.out.println(lub.calcLowerBound(ary, 2));
		System.out.println(lub.calcLowerBound(ary, 3));
		
		System.out.println("----");
		System.out.println(lub.calcUpperBound(ary, 1));
		System.out.println(lub.calcUpperBound(ary, 2));
		System.out.println(lub.calcUpperBound(ary, 3));
		
		System.out.println("----");
		// target 값이 배열에 존재할 때만 정상동작
		System.out.println(lub.calcLowerBound(ary, 4));
		System.out.println(lub.calcUpperBound(ary, 4));
	}

	/**
	 * 배열에서 target에 해당하는 lower bount index 구하는 메소드
	 * @param ary
	 * @param target
	 * @return lower bound index
	 */
	public int calcLowerBound(int[] ary, int target) {
		int leftIndex = 0;
		int rightIndex = ary.length - 1;
		
		while(leftIndex < rightIndex) {
			int midIndex = (leftIndex+rightIndex) / 2;
			
			if(ary[midIndex] >= target) {
				rightIndex = midIndex;
			}else {
				leftIndex = midIndex + 1;
			}
		}
		return rightIndex;
	}
	
	/**
	 * 배열에서 target에 해당하는 upper bound index 구하는 메소드
	 * @param ary
	 * @param target
	 * @return upper bound index
	 */
	public int calcUpperBound(int[] ary, int target) {
		int leftIndex = 0;
		int rightIndex = ary.length - 1;
		
		while(leftIndex < rightIndex) {
			int midIndex = (leftIndex+rightIndex) / 2;
			
			if(ary[midIndex] <= target) {
				leftIndex = midIndex + 1;
			}else {
				rightIndex = midIndex;
			}
		}
		return leftIndex;
	}
}
