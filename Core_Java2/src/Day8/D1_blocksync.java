package Day8;

class msg{
	public void show(String name) {
		synchronized(this.name) {
			
		}
	}
}

class ourthread extends Thread{
	msg m;
	String name;
	
	ourthread(msg m, String name){
		this.m = m;
		this.name = name;
	}
}

public class D1_blocksync {

	public static void main(String[] args) {
		msg m = new msg();
		ourthread t1 = new ourthread(m,"siri");
		ourthread t2 = new ourthread(m,"siri");
		t1.start();
		t2.start();

	}

}


// Java i/o stream
// - java.io package used
// - uses the concept of stream to make I/O operation fast.

// stream : -sequence of data
//			-composed of bytes(System.out, System.in, System.err)

// input stream class
// - int read() throws IOException: next byte
// - int available() throws IOException: return no of available byte
// - void close() throws IOException: closes current input stream


// BufferedInputStream class
// - used to read information from stream
// - Mechanism to make the performance fast


// BufferedOutputStream class
// - used to read information from stream 
// - uses buffer mechanism to make the performance fast.

