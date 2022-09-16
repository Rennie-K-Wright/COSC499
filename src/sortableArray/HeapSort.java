package sortableArray;

public class HeapSort {

	public static void main(String[] args) {
		char arr[] = { 'z', 'c', 'e', 'y', 'a' };
		HeapSort ob = new HeapSort();
		
		ob.sort(arr);
		System.out.println("Sorted array is");
		printArray(arr);
	}

	public void sort(char[] arr) {
		int N = arr.length;
		for (int i = N / 2 - 1; i >= 0; i--)
			heapify(arr, N, i);

		for (int i = N - 1; i > 0; i--) {
			char temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	void heapify(char[] arr, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// if left child is larger than root
		if (l < N && arr[l] > arr[largest]) {
			largest = l;
		}
		// if right child is larger than root
		if (r < N && arr[r] > arr[largest]) {
			largest = r;
		}

		// if largest is not root
		if (largest != i) {
			char swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// heapify the sub tree
			heapify(arr, N, largest);
		}
	}

	static void printArray(char arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}