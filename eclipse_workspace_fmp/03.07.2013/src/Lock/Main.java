package Lock;

public class Main {
	
	public static void main(String[] args) {
		
		Counter2 v = new Counter2();
		myThread first= new myThread(v);
		myThread second = new myThread(v);
		myThread third = new myThread(v);
		myThread fourth = new myThread(v);
		myThread fifth = new myThread(v);
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		fifth.start();
		
		
		
	}

}
