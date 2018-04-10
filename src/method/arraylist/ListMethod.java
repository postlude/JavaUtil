package method.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		ListMethod listMethod = new ListMethod();
		
		
		ArrayList<Integer> testList = new ArrayList<>();
		for(int index=0; index<4; index++) {
			testList.add(index);
		}

		// 리스트 뒤집기
		// 파라미터로 사용한 collection 자체의 순서가 뒤집어짐
		Collections.reverse(testList);
		listMethod.printList(testList);

		// toArray()
		Integer[] testStrAry = testList.toArray(new Integer[0]);
//		System.out.println(testStrAry.length);
		System.out.println(Arrays.toString(testStrAry));
	}

	/**
	 * List<Integer> 출력 메소드
	 * @param list
	 */
	public void printList(List<Integer> list) {
		for(int num : list) {
			System.out.println(num);
		}
	}
}
