package thread;

import java.util.ArrayList;

public class ThreadEx1 extends Thread{
	private int threadNum;

	public ThreadEx1(int threadNum) {
		this.threadNum = threadNum;
	}

	@Override
	public void run() {
		System.out.println(threadNum + " thread start");
		
		// 1s sleep
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(threadNum + " thread end");
	}
	
	public static void main(String[] args) {
		ArrayList<ThreadEx1> threadList = new ArrayList<>();
		
		int count = 10;
		
		for(int index=0; index<count; index++) {
			ThreadEx1 thread = new ThreadEx1(index+1);
			
			threadList.add(thread);
			
			// start() : thread 내의 run() 실행
			thread.start();
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		// join()
		// 모든 스레드가 끝난 후에 main 종료
		for(int index=0; index<count; index++) {
			try {
				threadList.get(index).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main end");
	}
}
