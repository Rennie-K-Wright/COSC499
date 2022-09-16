package sortableArray;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;


public class IntArraySortTest {

	@Test
	public void testSort() {
		int[] test = { 10, 3, 1, 17, 5, 16, 18, 2, 29, 95, 41, 111, 73, 12, 0, 6, 124, 118 };
		int[] sorted = { 0, 1, 2, 3, 5, 6, 10, 12, 16, 17, 18, 29, 41, 73, 95, 111, 118, 124 };
		BubbleSort bs = new BubbleSort();
		bs.sort(test);
		boolean equals = Arrays.equals(test, sorted);
		assertTrue(equals);
	}

}
