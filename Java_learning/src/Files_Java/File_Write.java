package Files_Java;

import java.io.FileWriter;
import java.io.IOException;

public class File_Write {

	public static void main(String[] args) throws IOException {
		
		String location = "usingFileWriter.txt";
		String content = "Seleninum learning";
		
		FileWriter fileWriter = new FileWriter(location);
		
		fileWriter.write(content);
		fileWriter.close();
		
		

	}
 
}
