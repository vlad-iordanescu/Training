package executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyRunnable {

	public static void main(String[] args) {

		Executor execute = Executors.newFixedThreadPool(100);

		execute.execute(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {

					try {

						System.out.println(i + 1);

						Thread.sleep(100);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

	}

}
