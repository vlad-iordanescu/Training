package WordCount;

import java.io.File;

public class Main {
	
	public static void main(String[] args){
		File file = new File ("examples.txt");
		Map map = ReadWord.readFile(file);
		System.out.println(map.wordmap.get("Hello").getCount());
		System.out.println(map.wordmap.get("World").getCount());
		
	}

}
