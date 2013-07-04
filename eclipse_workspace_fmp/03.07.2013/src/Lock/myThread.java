package Lock;

public class myThread extends Thread {

	private Counter2 v = new Counter2();

	public myThread(Counter2 v) {
		this.v = v;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				
				v.increment();
				
				System.out.println(v.getValue());
				
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
