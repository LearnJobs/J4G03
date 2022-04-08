package begin9;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestNIO {
	RandomAccessFile raf;
	FileChannel fc;

	public TestNIO() {
		try {
			raf = new RandomAccessFile("textfile.txt","rw");
			fc = raf.getChannel();

			ByteBuffer bBuf = ByteBuffer.allocate(48);

			int bRead = fc.read(bBuf);
			while(bRead != -1) {
				System.out.println("Read: "+bRead);
				bBuf.flip();

				while(bBuf.hasRemaining()) {
					System.out.print((char)bBuf.get());
				}

				bBuf.clear();
				bRead = fc.read(bBuf);
			}

		} catch(IOException e) {
		} finally {
			try {
				fc.close();
				raf.close();
			} catch(IOException e1) {
			}
		}
	}
	
	public static void main(String[] args) {
		new TestNIO();
	}
}