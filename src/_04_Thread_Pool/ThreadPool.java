package _04_Thread_Pool;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] queue;
	ConcurrentLinkedQueue<Task> tq;
	public ThreadPool(int i) {
		// TODO Auto-generated constructor stub
		queue = new Thread[i];
		tq = new ConcurrentLinkedQueue<Task>();
		for(int j = 0; j<queue.length;j++) {
			queue[j] = new Thread(new Worker(tq));
		}
	}

	public void addTask(Task t) {
		tq.add(t);
	}

	public void start() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<queue.length) {
			queue[i].start();
			try {
				queue[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

	

}
