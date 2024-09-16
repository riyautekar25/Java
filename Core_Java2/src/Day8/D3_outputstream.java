package Day8;

import java.io.FileOutputStream;
import java.io.IOException;

public class D3_outputstream {
	public static void main(String[] args) {
		FileOutputStream outfile = null;
		try {
			outfile = new FileOutputStream("src/output.txt");
			String content = "Hello this is my sample text file \n This is second line";
			byte[] contentbytes = content.getBytes();
			outfile.write(contentbytes);
			System.out.println("File has been writtem successfully");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outfile != null) {
				try {
					outfile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}


// Output stream
// - void write(int) throws IOException: write byte
// - void write(byte[]) throws IOException: array of byte
// - void flush() throws IOException: flushes current stream
// - void close() throws IOException: close current stream

// BufferedInputStream class
// used 