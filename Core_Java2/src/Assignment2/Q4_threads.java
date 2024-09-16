package Assignment2;

import java.util.Arrays;

class SumTask implements Runnable {
	private final int[] array;
	private final int start;
	private final int end;
	private int sum;

	public SumTask(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		sum = 0;
		for (int i = start; i < end; i++) {
			sum += array[i];
		}
	}

	public int getSum() {
		return sum;
	}
}

public class Q4_threads {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Example array
		int numThreads = 4; // Number of threads to use
		int length = array.length;
		int partSize = (length + numThreads - 1) / numThreads;

		Thread[] threads = new Thread[numThreads];
		SumTask[] tasks = new SumTask[numThreads];

		// Divide the array into parts and assign each part to a thread
		for (int i = 0; i < numThreads; i++) {
			int start = i * partSize;
			int end = Math.min(start + partSize, length);
			tasks[i] = new SumTask(array, start, end);
			threads[i] = new Thread(tasks[i]);
			threads[i].start();
		}

		// Wait for all threads to finish
		for (int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Combine the results from all threads
		int totalSum = Arrays.stream(tasks).mapToInt(SumTask::getSum).sum();
		System.out.println("Total sum: " + totalSum);
	}
}
