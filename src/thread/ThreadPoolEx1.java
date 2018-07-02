package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolEx1 {

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		 
//        for (int i = 0; i < 10; i++) {
//            Runnable runnable = new Runnable() {
//                @Override
//                public void run() {
//                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
// 
//                    int poolSize = threadPoolExecutor.getPoolSize();
//                    String threadName = Thread.currentThread().getName();
//                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
// 
//                    int value = Integer.parseInt("숫자");
//                }
//            };
// 
//            executorService.execute(runnable);
//            // executorService.submit(runnable);
// 
//            Thread.sleep(10);
//        }
//        executorService.shutdown();
		
		
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
		
		
		ThreadTest th1 = new ThreadTest();
		ThreadTest th2 = new ThreadTest();
		
		
		Future<Integer> future = threadPoolExecutor.submit(th1);
		int num = future.get();
		
		th2.setNum(future.get());
		Future<Integer> future2 = threadPoolExecutor.submit(th2);

		
		executorService.shutdown();
	}

}


class ThreadTest implements Callable<Integer>{
	int num = 0;
//
//	@Override
//	public void run() {
//		String threadName = Thread.currentThread().getName();
//		System.out.println("작업 스레드 이름: " + threadName);
//	}
	
	@Override
	public Integer call() throws Exception {
		String threadName = Thread.currentThread().getName();
		num++;
		System.out.println("작업 스레드 이름: " + threadName + " / 현재 num: " + num);
		
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}