package algorithm;

import java.util.Arrays;

public class InsertionSort {
	// 오름차순 정렬
	public void sort(int[] ary) {
		for(int sortIndex=1; sortIndex<ary.length; sortIndex++) {
			int swapIndex = -1;
			int swapNum = ary[sortIndex];
			
			// 루프 돌면서 sortIndex에 있는 값의 위치를 찾아 swap
			for(int compareIndex=sortIndex-1; compareIndex>=0; compareIndex--) {
				if(swapNum < ary[compareIndex]) {
					swapIndex = compareIndex;
					ary[compareIndex+1] = ary[compareIndex];
				}
			}
			if(swapIndex != -1) {
				ary[swapIndex] = swapNum;
			}
//			System.out.println(Arrays.toString(ary));
		}
	}
	
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] ary = {2, 7, 1, 4, 7, 10};
		
		insertionSort.sort(ary);
		System.out.println(Arrays.toString(ary));
	}
}
