package Day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D4_onefiletoanother {

	public static void main(String[] args) {
		String inputfilename = "src/input1.txt";
		String outputfilename = "src/output3.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(inputfilename));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputfilename))) {
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
