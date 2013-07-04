package Shop;



public class Main {
	

	public static void main(String[] args) throws InterruptedException {
		
		@SuppressWarnings("unused")
		ListaProduse lst = new ListaProduse();
		ListaProduse2 lst2 = new ListaProduse2();
		
		ThreadProducator producator = new ThreadProducator(lst2);
		ThreadConsumator consumator = new ThreadConsumator(lst2);
		
		consumator.start();
		producator.start();
		
		Thread.sleep(5000);
		producator.check(true);
		consumator.check(true);
		
		//producator.join();
		//consumator.join();
	}

}
