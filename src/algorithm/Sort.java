package algorithm;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		Sort sort = new Sort();
		
//		int[] ary = {2, 7, 1, 4, 7, 10};
		int[] ary = {10, 4, 5, 1, 2, 7, 7};
		
//		sort.bubbleSort(ary);
//		sort.insertionSort(ary);
//		sort.selectionSort(ary);
//		sort.quickSort(ary, 0, ary.length-1);
		sort.sort(ary, 0, ary.length-1);
//		System.out.println(Arrays.toString(ary));
	}

	/**
	 * bubble sort 오름차순 정렬
	 * 시간 복잡도 : O(n^2)
	 * @param ary
	 */
	public void bubbleSort(int[] ary) {
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
	
	/**
	 * insertion sort 오름차순 정렬
	 * 시간 복잡도 : O(n^2)
	 * @param ary
	 */
	public void insertionSort(int[] ary) {
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
	
	/**
	 * selection sort 오름차순 정렬
	 * 시간 복잡도 : O(n^2)
	 * @param ary
	 */
	public void selectionSort(int[] ary) {
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
	
	/**
	 * quick sort 오름차순 정렬
	 * @param ary
	 * @param left
	 * @param right
	 */
	public void quickSort(int[] ary, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int left = start;
		int right = end;
		int pivotIndex = (left + right) / 2;
		int pivot = ary[pivotIndex];
		
		while(left < right) {
			while(ary[left] < pivot) {
				left++;
			}
			while(ary[right] > pivot) {
				right--;
			}
			
			if(left < right) {
				// swap
				int temp = ary[left];
				ary[left] = ary[right];
				ary[right] = temp;
				
				left++;
				right--;
			}
			
		}
		System.out.println(Arrays.toString(ary));
//		System.out.println(left);
//		System.out.println(right);
		quickSort(ary, start, left-1);
		quickSort(ary, left, end);
	}
	
	public void sort(int[] data, int start, int end){
        int left = start;
        int right = end;
        int pivot = data[(start+end)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        System.out.println(left);
        System.out.println(right);
        System.out.println(Arrays.toString(data));
        if(start < right) sort(data, start, right);
        if(end > left) sort(data, left, end);
    }


	
//	public int partition(int[] ary, int left, int right) {
//		
//	}
}
