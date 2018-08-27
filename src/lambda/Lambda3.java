package lambda;

public class Lambda3 {

	public static void main(String[] args) {
		Lambda2 l2 = (int a, int b) -> {return a + b;};
		Lambda2 l3 = (int a, int b) -> a - b;
		
		System.out.println(l2.calc(1, 2));
		System.out.println(l3.calc(3, 4));
		
	}

}
