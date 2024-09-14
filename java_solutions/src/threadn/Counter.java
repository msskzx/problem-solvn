package threadn;

class Counter{

	private int counter;
	private final Object lock;
	
	Counter() {
		this.counter = 0;
		this.lock = new Object();
	}
	
	void incCounter() {
		synchronized (lock) {
			this.counter++;
		}
	}
	
	int getCounter() {
		return this.counter;
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				counter.incCounter();
				System.out.printf("Thread 1: %d\n", counter.getCounter());
				
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				counter.incCounter();
				System.out.printf("Thread 2: %d\n", counter.getCounter());
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(counter.getCounter());
		
	}

}
