package Day8;

import java.io.FileInputStream;
import java.io.IOException;

public class D2_inputstream {

	public static void main(String[] args) {
		FileInputStream infile = null;
		try {
			infile = new FileInputStream("src/example.txt");
			int content;
			while ((content = infile.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (infile != null) {
				try {
					infile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
