package spring_ws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class testFileCopy {

	@Test
	public void testFile() throws IOException {
		File file1 = new File("C:\\Users\\McHeat\\Desktop\\DSC_0338.JPG");
		File file2 = new File("D:\\1.JPG");
		int byteCount = 0;
		byte[] buffer = new byte[4096];
		InputStream stream1 = new FileInputStream(file1);
		OutputStream stream2 = new FileOutputStream(file2);
		try {
			int byteRead = -1;
			while ((byteRead = stream1.read(buffer)) != -1) {
				stream2.write(buffer, 0, byteRead);
				byteCount += byteRead;
			}
			stream2.flush();
		} finally {
			try {
				stream1.close();
			} catch(Exception e) {
				
			}
			try {
				stream2.close();
			} catch(Exception e) {
				
			}
		}

		System.out.println(byteCount);
	}
	
}
