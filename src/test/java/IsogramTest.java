import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import org.junit.Before;

public class IsogramTest {

	private String s1;

	@Test
	public void testStringIsNotIsogram() {
		assertEquals("This is not an isogram", new Isogram().isIsogram("hello"));
	}

	@Test
	public void testStringIsIsogram() {
		assertEquals("This is an isogram", new Isogram().isIsogram("no"));
	}

	@Test
	public void testLongStringIsIsogram() {
		assertEquals("This is an isogram", new Isogram().isIsogram("abcdefghijklmno"));
	}

	@Test
	public void testEmptyStringThrowsException() {
		IllegalArgumentException expected = assertThrows(IllegalArgumentException.class, () -> new Isogram().isIsogram(""));
		assertThat(expected).hasMessage("Empty string not allowed");
	}

}
