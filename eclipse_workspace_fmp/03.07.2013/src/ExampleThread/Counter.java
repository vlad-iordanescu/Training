package ExampleThread;

public class Counter {

	private static int value;

	public void incrementValue() {
		synchronized (Counter.class) {
			value++;
			value += 5;
		}
	}

	public synchronized int getValue() {
		return value;
	}
/*
	public synchronized void setValue(int value) {
		this.value = value;
	}
*/
}

