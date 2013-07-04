package prezentari;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class FileIO {
	
	public static String readFile(File file) {

		FileReader reader = null;
		BufferedReader bufferreader = null;
		StringBuilder ab = new StringBuilder();

		try {

			reader = new FileReader(file);
			bufferreader = new BufferedReader(reader);

			

			String line = null;

			while ((line = bufferreader.readLine()) != null) {
				ab.append(line);
				ab.append(System.getProperty("line separator"));
			}

			//bufferreader.readLine();

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

		return ab.toString();
	}

	public static void main(String[] args) {
		File file = new File ("examples.txt");
		System.out.println(FileIO.readFile(file));

	}

}
