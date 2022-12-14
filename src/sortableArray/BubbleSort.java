package sortableArray;

public class BubbleSort {

	public void sort(int[] arr) {
		int n = arr.length;
		boolean swapOccurred = false;
		do {
			swapOccurred = false;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapOccurred = true;
				}
			}
		} while (swapOccurred);
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
