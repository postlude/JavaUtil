package method.arraylist;

public class ArrayMethod {

	public static void main(String[] args) {
		
	}
	
	
	/**
	 * int 배열 출력 method
	 * @param array
	 */
	public void printArray(int[] array) {
		//1줄에 1개씩 출력
//		for(int num : array) {
//			System.out.println(num);
//		}
		
		//1줄에 전부 출력
		for(int num : array) {
			System.out.print(num + " ");
		}
	}
}
