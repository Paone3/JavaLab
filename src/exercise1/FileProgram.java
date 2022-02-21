package exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileProgram 
{
public static void main(String[] args) throws FileNotFoundException {
		
		String inFile = "C:\\Users\\DKUMA147\\eclipse-workspace\\Lab8\\src\\exercise1\\Source.txt";
		String outFile = "C:\\Users\\DKUMA147\\eclipse-workspace\\Lab8\\src\\exercise1\\Target.txt";
		
		File iFile = new File(inFile);
		File oFile = new File(outFile);
		
		InputStream is = new FileInputStream(iFile);
		OutputStream os = new FileOutputStream(oFile);
		
		CopyDataThread c1 = new CopyDataThread(is, os);
		Thread t = new Thread(c1);
		t.start();

	}

}
