package Day8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class D4_buffereinstream {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/a1.txt");
			bis = new BufferedInputStream(fis);
			int content;
			while ((content = bis.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
