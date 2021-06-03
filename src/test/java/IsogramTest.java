import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class IsogramTest {

	private String s1;

	@Test
	public void testStringIsIsogram() {
		assertEquals("This is not an isogram", new Isogram().isIsogram("hello"));
	}

}
