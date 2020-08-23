package _04_Thread_Pool;

import java.util.ArrayList;

public class ThreadPool {
	Object[] queue;
	public ThreadPool(int i) {
		// TODO Auto-generated constructor stub
		queue = new Object[i];
	}

	public void addTask(Object object) {
		// TODO Auto-generated method stub
		Object[] temp = new Object[queue.length+1];
		 for(int i = 0; i<queue.length;i++) {
			 //temp = temp+queue[i];
		 }
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	

}
