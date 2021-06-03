import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class IsogramTest {

	private String s1;

	@Test
	public void testStringIsIsogram() {
		assertEquals("Nothing to see here", new Isogram().isIsogram(s1));
	}

}
