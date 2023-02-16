package Fileswrite_Java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_filewriter {

	public static void main(String[] args) throws IOException {
		
		String location = "usingBuffferFileWriter.txt";
		String content = "Cucumber learning !!";
		
		FileWriter fileWriter = new FileWriter(location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		 bufferedWriter.close();

	}

}
