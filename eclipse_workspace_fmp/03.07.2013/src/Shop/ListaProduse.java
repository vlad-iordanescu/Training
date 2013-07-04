package Shop;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ListaProduse {

	private Queue<Produs> lista = new LinkedList<Produs>();
	private Object lock = new Object();
	boolean done = false;
	Lock l = new ReentrantLock();
	
	public void check(boolean dn) {
		done = dn;
	}

	
	
	public void addToListaProdus(Produs prod) {
		synchronized (lock) {
			lista.add(prod);
			System.out.println("Produs added");
			lock.notify();
		}

	}

	public Produs getProdus() throws InterruptedException {
		synchronized (lock) {
			if (lista.isEmpty()){
				if(done) {
				ThreadConsumator.interrupted();
				}
				lock.wait();
			}
			System.out.println("Produs taken");
			return lista.poll();
		}
	}

	
	
}
