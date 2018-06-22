package algorithm;

import java.util.Arrays;

public class BubbleSort {

	public void sort(int[] ary) {
		for(int limitIndex=ary.length-2; limitIndex>=0; limitIndex--) {
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
