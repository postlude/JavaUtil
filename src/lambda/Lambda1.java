package lambda;

public class Lambda1 {

	public static void main(String[] args) {
		// traditional code
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("run method");
			}
		}).start();
		
		// lambda code
		new Thread(() -> {
			System.out.println("lambda method");
		}).start();
	}
}
