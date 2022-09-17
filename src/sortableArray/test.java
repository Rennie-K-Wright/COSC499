package sortableArray;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 2, 45, 10, 30, 35 };
		
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
		System.out.println("Sorted integer array is: ");
		printArray(arr);
		
		char arr2[] = { 'z', 'c', 'e', 'y', 'a' };
		HeapSort ob = new HeapSort();

		ob.sort(arr2);
		System.out.println("Sorted character array is: ");
		printArray(arr2);
	}

	static void printArray(char arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
