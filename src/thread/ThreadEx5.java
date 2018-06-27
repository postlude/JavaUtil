package thread;

public class ThreadEx5 {

	public static void main(String[] args) {
		TestThread1 t1 = new TestThread1();
		TestThread1 t2 = new TestThread1();
		
		t1.start();
		t2.start();
		
		
		for(int index=0; index<10; index++) {
			System.out.println("t1 state : " + t1.getState());
			System.out.println("t2 state : " + t2.getState());
		}
	}
}

class TestThread1 extends Thread{
	int sharedVal = 0;
	
	@Override
	public void run() {
		System.out.println(getName());
//		method();
		
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void method() {
//		System.out.println(getState());
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("current sharedVal : " + sharedVal);
		sharedVal++;
		System.out.println("after add 1 sharedVal : " + sharedVal);
	}
}