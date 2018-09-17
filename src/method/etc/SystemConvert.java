package method.etc;

import java.util.Stack;

public class SystemConvert {

	public static void main(String[] args) {
		SystemConvert sc = new SystemConvert();
		
		System.out.println(sc.convertSystem(2, 10));
		System.out.println(sc.convertSystem(8, 10));
		System.out.println(sc.convertSystem(16, 10));
		System.out.println(sc.convertSystem(16, 31));
		
		System.out.println("------");
		System.out.println(sc.convertSystem(3, 31));
		System.out.println(sc.convertSystem(6, 32));
	}
	
	/**
	 * 진법 변환 메소드. 10이 넘어가는 수는 알파벳 대문자 A부터 시작
	 * @param system - 진법
	 * @param num - 변환할 수
	 * @return system 진법으로 변환한 문자열
	 */
	public String convertSystem(int system, int num) {
		switch(system) {
			case 2 : {
				return Integer.toBinaryString(num);
			}
			case 8 : {
				return Integer.toOctalString(num);
			}
			case 16 : {
				return Integer.toHexString(num).toUpperCase();
			}
			default : {
				StringBuilder sb = new StringBuilder();
				Stack<Integer> stack = new Stack<>();
				
				while(num >= system) {
					int mod = num % system;
					stack.push(mod);
					num /= system;
				}
				stack.push(num);
				
				while(!stack.isEmpty()) {
					int mod = stack.pop();
					
					if(mod >= 10) {
						char appendCh = (char)(55 + mod);
						sb.append(appendCh);
					}else {
						sb.append(mod);
					}
				}
				
				return sb.toString();
			}
		}
	}
}
