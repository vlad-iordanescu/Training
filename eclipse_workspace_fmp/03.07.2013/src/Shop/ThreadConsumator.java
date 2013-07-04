package Shop;

import java.util.Random;

public class ThreadConsumator extends Thread {

	boolean done = false;
	private ListaProduse lst = new ListaProduse();
	@SuppressWarnings("unused")
	private ListaProduse2 lst2 = new ListaProduse2();
	Random nr= new Random();
	Produs prod = new Produs();

	public ThreadConsumator(ListaProduse lst) {
		this.lst = lst;
	}
	public ThreadConsumator(ListaProduse2 lst2) {
		this.lst2 = lst2;
	}
	
	public void check(boolean dn) {
		done = dn;
	}

	public void run() {
		while(!done) {
			try {
				prod = lst.getProdus();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

}
