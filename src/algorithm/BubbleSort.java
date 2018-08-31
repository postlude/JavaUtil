package algorithm;

import java.util.Arrays;

public class BubbleSort {
	// 오름차순 정렬
	public void sort(int[] ary) {
		// 자신과 바로 다음 것을 비교하므로 시작값이 length-2
		for(int limitIndex=ary.length-2; limitIndex>=0; limitIndex--) {
			// 루프 돌면서 2개씩 비교해 swap
			for(int swapIndex=0; swapIndex<=limitIndex; swapIndex++) {
				if(ary[swapIndex] > ary[swapIndex+1]) {
					int temp = ary[swapIndex];
					ary[swapIndex] = ary[swapIndex+1];
					ary[swapIndex+1] = temp;
				}
			}
//			System.out.println(Arrays.toString(ary));
		}
	}
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
//		int[] ary = {2, 7, 1, 4, 7, 10};
		int[] ary = {10, 4, 1, 5, 2, 7, 7};
		
		bubbleSort.sort(ary);
		System.out.println(Arrays.toString(ary));
	}
}
