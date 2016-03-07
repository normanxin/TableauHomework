import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;


public class ReverseStringTest {

	@Test
	public void testReverseString() {
		assertEquals("#@!321cbaCBA", ReverseString.reverse("ABCabc123!@#"));
	}
	
	@Test
	public void testReverseEmptyString() {
		assertEquals("", ReverseString.reverse(""));
	}
	
	@Test
	public void testNullString() {
		assertNull(ReverseString.reverse(null));
	}
}
