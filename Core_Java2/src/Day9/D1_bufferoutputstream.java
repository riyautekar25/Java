package Day9;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D1_bufferoutputstream {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("src/output1.txt");
			bos = new BufferedOutputStream(fos);
			String content = "Hello, this is a sample output text using BufferedOutputStream class.";
			byte[] contentBytes = content.getBytes();
			bos.write(contentBytes);
			System.out.println("File has been printing successfully...");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) {
					bos.close();
				}
				if(fos!=null) {
					fos.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}




// FileReader and FileWriter
// - used to write and read data from text files
// - character oriented class

// read the content from one file and write in another file
// write the content to multiple files
// how to create the file through program 
