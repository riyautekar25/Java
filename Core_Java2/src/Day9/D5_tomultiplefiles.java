package Day9;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D5_tomultiplefiles {

	public static void main(String[] args) {
		String data = "Multiple line transfer demo";
		try (ByteArrayOutputStream bo = new ByteArrayOutputStream()) {
			bo.write(data.getBytes());
			// convert the ByteArrayOutputStream to a byte array
			byte[] byteArray = bo.toByteArray();
			writeTofile(byteArray, "src/output1.txt", "src/output2.txt", "src/output3.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void writeTofile(byte[] byteArray, String... fileNames) {
		for (String filename : fileNames) {
			try (FileOutputStream fos = new FileOutputStream(filename)) {
				fos.write(byteArray);
				System.out.println("Data written to file:" + filename);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
	