package Lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Counter2 {

	private ReentrantReadWriteLock l = new ReentrantReadWriteLock();

	private int value = 0;

	public int getValue() {
		l.readLock().lock();
		try {
			return value;
		} finally {
			l.readLock().unlock();
		}
	}

	public void increment() {
		l.writeLock().lock();
		try {
			this.value++;
		} finally {
			l.writeLock().unlock();
		}

	}

}
