package executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService execute = Executors.newFixedThreadPool(100) ;
		
		Future<String> futureResult = execute.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				String text = new String();
				
				for(int i=0;i<500;i++){
					text += " " + (i+1);
				}
				return text;
			}
			
			
		});
		
		String result = futureResult.get();
		System.out.println(result);
	}

}
