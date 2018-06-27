package thread;

public class ThreadEx4{
	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();
		 
        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);
 
        threadA.start();
        threadB.start();
	}
}


class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듬
 
        try {
            wait(); // ThreadA를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {
        }
    }
 
    public synchronized void methodB() {
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify();
 
        try {
            wait();
        } catch (InterruptedException e) {
        }
    }
}

class ThreadA extends Thread {
    
    private WorkObject workObject;
    
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
 
}

class ThreadB extends Thread {
    
    private WorkObject workObject;
    
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
 
}