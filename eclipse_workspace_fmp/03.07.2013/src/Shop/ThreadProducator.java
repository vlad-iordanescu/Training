package Shop;

import java.util.Random;

public class ThreadProducator extends Thread {

	private ListaProduse lst = new ListaProduse();
	@SuppressWarnings("unused")
	private ListaProduse2 lst2 = new ListaProduse2();
	Random nr = new Random();
	boolean done=false;

	public ThreadProducator(ListaProduse lst) {
		this.lst = lst;
	}
	
	public ThreadProducator(ListaProduse2 lst2) {
		this.lst2 = lst2;
	}

	public void check(boolean dn) {
		done = dn;
	}

	public void run() {
		Produs prod = new Produs();
		while (!done) {
			try {
				lst.addToListaProdus(prod);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lst.check(true);
	}

}
