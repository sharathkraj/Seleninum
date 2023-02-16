package Files_read;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_reader {

	public static void main(String[] args) throws IOException {
		
		String location = "usingBuffferFileWriter.txt";
		
		
		FileReader filereader = new FileReader(location);
		
		BufferedReader reader = new BufferedReader(filereader);
		
		String currenrLine;
		
		while((currenrLine=reader.readLine())!= null) {
			System.out.print(currenrLine);
		}
	}

}
