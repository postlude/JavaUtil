package etc;

public class Permutation {

	public static void main(String[] args) {
		Permutation permutation = new Permutation();
		
		int[] ary = {3, 2, 2, 1};
		if(permutation.nextPermutation(ary)) {
			Print.printAry(ary, true);
		}else {
			System.out.println("last permutation");
		}
	}
	
	/**
	 * int 배열로 주어진 순열의 사전 순 다음 순열 구하는 메소드
	 * 순열은 정수로 이루어져 있어야 하며 같은 수가 존재해도 가능하다
	 * @param permutationArray
	 * @return 사전 순 제일 마지막 순열인 경우 다음 순열이 없으므로 false return, 이외의 경우에는 true return
	 */
	public boolean nextPermutation(int[] permutationArray) {
		int sizeOfAry = permutationArray.length;
		
		//부호 방향이 < 인 순간을 찾을 index
		int index = sizeOfAry - 1;
		//맨 뒤에서부터 이전 값과 비교하여 현재 값이 더 커지는 순간에 while 종료
		while(index>0 && permutationArray[index-1]>=permutationArray[index]) {
			index--;
		}
		//while이 끝까지 돌았다는 것은 제일 마지막 순열이라는 의미이므로 다음 순열이 존재하지 않는다.
		if(index == 0) {
			return false;
		}
		
		//permutationArray[index-1] 보다 크면서 가장 작은 수의 index
		int swapIndex = sizeOfAry - 1;
		while(permutationArray[index-1] >= permutationArray[swapIndex]) {
			swapIndex--;
		}
		
		//index-1의 값과 swapIndex의 값을 swap
		int temp = permutationArray[index-1];
		permutationArray[index-1] = permutationArray[swapIndex];
		permutationArray[swapIndex] = temp;
		
		//permutationArray의 index부터 마지막까지 값의 순서를 거꾸로
		int endIndex = sizeOfAry - 1;
		while(index < endIndex) {
			//swap
			temp = permutationArray[index];
			permutationArray[index] = permutationArray[endIndex];
			permutationArray[endIndex] = temp;
			
			//index 변경
			index++;
			endIndex--;
		}
		return true;
	}
	
	/**
	 * int 배열로 주어진 순열의 사전 순 이전 순열 구하는 메소드
	 * 순열은 정수로 이루어져 있어야 하며 같은 수가 존재해도 가능하다
	 * @param permutationArray
	 * @return 사전 순 제일 첫 순열인 경우 이전 순열이 없으므로 false return, 이외의 경우에는 true return
	 */
	public boolean prevPermutation(int[] permutationArray) {
		int sizeOfAry = permutationArray.length;
		
		//부호 방향이 > 인 순간을 찾을 index
		int index = sizeOfAry - 1;
		//맨 뒤에서부터 이전 값과 비교하여 현재 값이 더 작아지는 순간에 while 종료
		while(index>0 && permutationArray[index-1]<=permutationArray[index]) {
			index--;
		}
		//while이 끝까지 돌았다는 것은 제일 첫 순열이라는 의미이므로 이전 순열이 존재하지 않는다.
		if(index == 0) {
			return false;
		}
		
		//permutationArray[index-1] 보다 작으면서 가장 큰 수의 index
		int swapIndex = sizeOfAry - 1;
		while(permutationArray[index-1] <= permutationArray[swapIndex]) {
			swapIndex--;
		}
		
		//index-1의 값과 swapIndex의 값을 swap
		int temp = permutationArray[index-1];
		permutationArray[index-1] = permutationArray[swapIndex];
		permutationArray[swapIndex] = temp;
		
		//permutationArray의 index부터 마지막까지 값의 순서를 거꾸로
		int endIndex = sizeOfAry - 1;
		while(index < endIndex) {
			//swap
			temp = permutationArray[index];
			permutationArray[index] = permutationArray[endIndex];
			permutationArray[endIndex] = temp;
			
			//index 변경
			index++;
			endIndex--;
		}
		return true;
	}
}
