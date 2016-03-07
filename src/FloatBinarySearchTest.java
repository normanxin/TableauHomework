import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FloatBinarySearchTest {

	@Test
	public void testSearchFloat() {
		assertEquals(1, FloatBinarySearch.search(new float[] { 1.0f, 1.1f, 1.2f }, 1.1f));
	}
	
	@Test
	public void testSearchDuplicate() {
		assertEquals(1, FloatBinarySearch.search(new float[] { 1.0f, 1.1f, 1.1f, 1.2f }, 1.1f));
	}
	
	@Test
	public void testSearchTargetAtLeftBound() {
		assertEquals(0, FloatBinarySearch.search(new float[] { 1.1f, 1.2f, 1.3f }, 1.1f));
	}
	
	@Test
	public void testSearchTargetAtRightBound() {
		assertEquals(2, FloatBinarySearch.search(new float[] { 1.1f, 1.2f, 1.3f }, 1.3f));
	}
	
	@Test
	public void testSearchInSingleElementArray() {
		assertEquals(0, FloatBinarySearch.search(new float[] { 1.1f }, 1.1f));
	}
	
	@Test
	public void testSearchNotFount() {
		assertEquals(-1, FloatBinarySearch.search(new float[] { 1.0f, 1.2f, 1.3f }, 1.1f));
	}
	
	@Test
	public void testSearchInEmptyElementArray() {
		assertEquals(-1, FloatBinarySearch.search(new float[] {}, 1.1f));
	}
	
	@Test
	public void testSearchInNullElementArray() {
		assertEquals(-1, FloatBinarySearch.search(null, 1.1f));
	}
}
