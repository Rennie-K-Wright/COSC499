package sortableArray;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;

public class CharArraySortTest {

	@Test
	public void testSort13Char() {
		char[] sorted = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
		char[] test = {'m','f','k','c','g','d','b','e','l','a','i','h','j'};
		HeapSort sorter = new HeapSort();
		sorter.sort(test);
		boolean equal = Arrays.equals(sorted, test);
		assertTrue(equal);
	}
	
	static void printArray(char arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
