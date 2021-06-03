import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import org.junit.Before;

public class IsogramTest {

	private Isogram iso;

	@Before
	public void setup() {
		iso = new Isogram();
	}

	@Test
	public void testStringIsNotIsogram() {
		assertEquals("False", iso.isIsogram("hello"));
	}

	@Test
	public void testStringIsIsogram() {
		assertEquals("True", iso.isIsogram("no"));
	}

	@Test
	public void testLongStringIsIsogram() {
		assertEquals("True", iso.isIsogram("abcdefghijklmno"));
	}

	@Test
	public void testEmptyStringThrowsException() {
		IllegalArgumentException expected = assertThrows(IllegalArgumentException.class, () -> iso.isIsogram(""));
		assertThat(expected).hasMessage("Empty string not allowed");
	}

}
