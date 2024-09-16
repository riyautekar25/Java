package Day9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class D3_Filewriter {

	public static void main(String[] args) {
		String filename = "src/output2.txt";
		String content = "Hello welcome to file writing";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
			bw.write(content);
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
