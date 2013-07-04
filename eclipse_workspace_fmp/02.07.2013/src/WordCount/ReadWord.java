package WordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadWord {

	public static Map readFile(File file) {

		FileReader reader = null;
		BufferedReader bufferreader = null;
		Number nr = new Number();
		Map map = new Map();

		try {

			reader = new FileReader(file);
			bufferreader = new BufferedReader(reader);

			String line = null;

			while ((line = bufferreader.readLine()) != null) {

				String[] cuvinte = line.split(" ");

				for (int i = 0; i < cuvinte.length; i++) {
					if (!map.wordmap.containsKey(cuvinte[i])) {
						nr = new Number();
						nr.setCount(1);
						map.wordmap.put(cuvinte[i], nr);
					} else {
						nr = map.wordmap.get(cuvinte[i]);
						nr.setCount(nr.getCount()+1);
						map.wordmap.put(cuvinte[i], nr);
					}
				}
			}



		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferreader != null) {
					bufferreader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return map;
	}

}
