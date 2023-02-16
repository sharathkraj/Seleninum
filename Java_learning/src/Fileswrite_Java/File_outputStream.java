package Fileswrite_Java;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File_outputStream {

	public static void main(String[] args) throws IOException {
		
		String location = "Fileoutputstream.txt";
		String content = "File FIle learning !!";
		
		FileOutputStream outputstream = new FileOutputStream (location);
		
		byte[] writeThis = content.getBytes();
		
		outputstream.write(writeThis);
		outputstream.close();

	}

}
