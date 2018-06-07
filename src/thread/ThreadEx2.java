package thread;

public class ThreadEx2 extends Thread{
	private static final int COUNT = 10;
	private int num;
	
	public ThreadEx2(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		System.out.println(num + " thread start");
		
		if(num < ThreadEx2.COUNT) {
			int nextNum = num + 1;
			ThreadEx2 thread = new ThreadEx2(nextNum);
			
			thread.start();
			try {
				// join() : 스레드가 죽을 때까지 기다리는 메소드
				// start 전에 호출하면 시작되지 않았으므로 바로 빠져나오게 됨
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(num + " thread end");
	}

	public static void main(String[] args) {
		ThreadEx2 thread = new ThreadEx2(1);
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");
	}
}
