package ExampleThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		MyThread myThread = new MyThread(counter);
		MyThread threadDoi = new MyThread(counter);

		myThread.start();
		threadDoi.start();

		myThread.join();
		threadDoi.join();

		System.out.println("Value " + counter.getValue());
	}

}
