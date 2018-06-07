package thread;

public class ThreadEx3 implements Runnable{
	private int num;
	
	public ThreadEx3(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		System.out.println(num + " thread start");
		
		System.out.println(num + " thread end");
	}

	public static void main(String[] args) {
		int count = 10;
		
		for(int index=0; index<count; index++) {
			Runnable runnable = new ThreadEx3(index+1);
			Thread thread = new Thread(runnable);
			thread.start();
		}
	}
}
