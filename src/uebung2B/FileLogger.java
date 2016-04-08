package uebung2B;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FileLogger implements Logger{
	
	public void log(String text) throws IOException{
		
		List<String> lines = Arrays.asList(text);
		
		Path file = Paths.get("/home/max/Desktop/test.txt");
		Files.write(file, lines, Charset.forName("UTF-8"));

		
	}

}
