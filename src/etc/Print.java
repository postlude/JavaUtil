package etc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Print {

	public static void main(String[] args) {
//		Print t = new Print();
		
//		int[] ary1 = {1, 2, 3};
//		String[] ary2 = {"1234", "1111"};
//		char[] ary3 = {'a', 'b', 'c'};
//		String[][] ary4 = {{"1234", "1111"}, {"1234", "1111"}, {"1234", "1111"}};
		
//		Print.printAry(ary1, true);
//		Print.printAry(ary4);
//		Print.printAry(ary2, true);
	}
	
	/**
	 * int 1차원 배열 출력
	 * @param ary
	 * @param sameLine
	 */
	public static void printAry(int[] ary, boolean sameLine) {
		if(sameLine) {
			System.out.println(Arrays.toString(ary));
		}else {
			for(int num : ary) {
				System.out.println(num);
			}
		}
	}
	
	/**
	 * char 1차원 배열 출력
	 * @param ary
	 * @param sameLine
	 */
	public static void printAry(char[] ary, boolean sameLine) {
		if(sameLine) {
			System.out.println(Arrays.toString(ary));
		}else {
			for(char ch : ary) {
				System.out.println(ch);
			}
		}
	}
	
	/**
	 * 객체 1차원 배열 출력
	 * @param <T>
	 * @param ary
	 * @param sameLine
	 */
	public static <T> void printAry(T[] ary, boolean sameLine) {
		if(sameLine) {
			System.out.println(Arrays.toString(ary));
		}else {
			for(T value : ary) {
				System.out.println(value);
			}
		}
	}
	
	/**
	 * int 2차원 배열 출력
	 * @param ary
	 */
	public static void printAry(int[][] ary) {
		for(int[] row : ary) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	/**
	 * char 2차원 배열 출력
	 * @param ary
	 */
	public static void printAry(char[][] ary) {
		for(char[] row : ary) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	/**
	 * 객체 2차원 배열 출력
	 * @param <T>
	 * @param ary
	 */
	public static <T> void printAry(T[][] ary) {
		for(T[] row : ary) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	/**
	 * list 출력
	 * @param <T>
	 * @param list
	 * @param sameLine
	 */
	public static <T> void printList(List<T> list, boolean sameLine) {
		for(T value : list) {
			if(sameLine) {
				System.out.print(value + " ");
			}else {
				System.out.println(value);
			}
		}
		
		if(sameLine) {
			System.out.println();
		}
	}
	
	/**
	 * set 출력
	 * @param <T>
	 * @param set
	 * @param sameLine
	 */
	public static <T> void printSet(HashSet<T> set, boolean sameLine) {
		Iterator<T> iter = set.iterator();
		while(iter.hasNext()) {
			if(sameLine) {
				System.out.print(iter.next() + " ");
			}else {
				System.out.println(iter.next());
			}
		}
		
		if(sameLine) {
			System.out.println();
		}
	}
	
	/**
	 * map 출력
	 * @param <T1>
	 * @param <T2>
	 * @param map
	 */
	public static <T1, T2> void printMap(HashMap<T1, T2> map) {
		Iterator<T1> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			T1 key = iter.next();
			T2 value = map.get(key);
			System.out.println(key + " | " + value);
		}
	}
}
