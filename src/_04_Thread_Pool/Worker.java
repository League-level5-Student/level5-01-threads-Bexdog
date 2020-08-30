package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> tq;
	public Worker(ConcurrentLinkedQueue<Task> temp) {
		tq = temp;
	}
	@Override
	public void run() {
		while(!tq.isEmpty()) {
			tq.remove().perform();
		}
	}


}
