package algorithm;

import java.util.Arrays;

public class SelectionSort {
	// 오름차순 정렬
	public void sort(int[] ary) {
		for(int limitIndex=ary.length-1; limitIndex>=0; limitIndex--) {
			int maxNum = Integer.MIN_VALUE;
			int maxIndex = -1;
			
			// 루프 돌면서 가장 큰 값 찾음
			for(int index=0; index<=limitIndex; index++) {
				int compareNum = ary[index]; 
				if(compareNum > maxNum) {
					maxNum = compareNum;
					maxIndex = index;
				}
			}
			
			// swap
			ary[maxIndex] = ary[limitIndex]; 
			ary[limitIndex] = maxNum;
		}
	}
	
	public static void main(String[] args) {
		SelectionSort selctionSort = new SelectionSort();
//		int[] ary = {2, 7, 1, 4, 7, 10};
		int[] ary = {10, 4, 1, 5, 2, 7, 7};
		
		selctionSort.sort(ary);
		System.out.println(Arrays.toString(ary));
	}

}
