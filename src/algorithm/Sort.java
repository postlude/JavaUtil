package algorithm;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		Sort sort = new Sort();
		
//		int[] ary = {2, 7, 1, 4, 7, 10};
		int[] ary = {5, 4, 10, 2, 1, 7, 7};
		
//		sort.bubbleSort(ary);
//		sort.insertionSort(ary);
//		sort.selectionSort(ary);
		sort.quickSort(ary, 0, ary.length-1);
//		sort.sort(ary, 0, ary.length-1);
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
		
		// 등호가 있는 이유는 아래에 재귀호출 시 동일한 값을 가지고 계속 호출되기 때문에  left, right를 다른 값으로 바꿔줘야한다.
		// ex) [1, 2, 3 ...]
		// start:2, end:3 일 경우 재귀 호출 전 left, right가 동일하게 2
		// quickSort(ary, 2, 2); => 종료
		// quickSort(ary, 2, 3); => 동일한 값으로 호출 => 무한 반복
		while(left <= right) {
			while(ary[left] < pivot) {
				left++;
			}
			while(ary[right] > pivot) {
				right--;
			}
			
			// 마찬가지로 같을 때 swap은 의미없지만, left, right를 진행시키기 위해 등호 필요
			if(left <= right) {
				// swap
				int temp = ary[left];
				ary[left] = ary[right];
				ary[right] = temp;
				
				// 등호를 없애고 아래 코드를 if밖으로 빼면 이미 right, left 순서가 역전된 상황에서도 left, right를 한번 씩 더 진행시키므로 오류
				left++;
				right--;
			}
			
		}
		System.out.println(Arrays.toString(ary));
//		System.out.println(left);
//		System.out.println(right);
		quickSort(ary, start, right);
		quickSort(ary, left, end);
	}
	
//	public int partition(int[] ary, int left, int right) {
//		
//	}
}
