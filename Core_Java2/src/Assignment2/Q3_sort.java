package Assignment2;

import java.util.Arrays;

class SortThread extends Thread {
	private final int[] array;
	private final int left;
	private final int right;

	public SortThread(int[] array, int left, int right) {
		this.array = array;
		this.left = left;
		this.right = right;
	}

	public void run() {
		Arrays.sort(array, left, right + 1);
	}

	private static void merge(int[] array, int left, int mid, int right) {
		int[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
		int[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);

		int i = 0, j = 0, k = left;

		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			} else {
				array[k++] = rightArray[j++];
			}
		}

		while (i < leftArray.length) {
			array[k++] = leftArray[i++];
		}

		while (j < rightArray.length) {
			array[k++] = rightArray[j++];
		}
	}

	public static void parallelSort(int[] array, int numThreads) {
		int length = array.length;
		int partSize = (length + numThreads - 1) / numThreads;

		Thread[] threads = new Thread[numThreads];

		// Divide the array into parts and sort each part in a separate thread
		for (int i = 0; i < numThreads; i++) {
			int left = i * partSize;
			int right = Math.min((i + 1) * partSize - 1, length - 1);

			threads[i] = new SortThread(array, left, right);
			threads[i].start();
		}

		// Wait for all sorting threads to finish
		for (int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Merge the sorted parts
		for (int size = partSize; size < length; size *= 2) {
			for (int left = 0; left < length; left += 2 * size) {
				int mid = Math.min(left + size - 1, length - 1);
				int right = Math.min(left + 2 * size - 1, length - 1);

				if (mid < right) {
					merge(array, left, mid, right);
				}
			}
		}
	}
}

public class Q3_sort {

	public static void main(String[] args) {
		int[] array = { 38, 27, 43, 3, 9, 82, 10 }; // Example array
		int numThreads = 4; // Number of threads to use

		System.out.println("Original array: " + Arrays.toString(array));

		SortThread.parallelSort(array, numThreads);

		System.out.println("Sorted array: " + Arrays.toString(array));

	}

}
