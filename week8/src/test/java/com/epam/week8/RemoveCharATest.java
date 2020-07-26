package com.epam.week8;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
class RemoveCharATest {

	
	RemoveCharA removeChara;
	@BeforeEach
	void initialization()
	{
		removeChara = new RemoveCharA(); 
	}

	@Test
	void testNull() {
		assertEquals("",removeChara.removeA(""));
	}
	@Test
	void testOneChar() {
		assertEquals("",removeChara.removeA("A"));
		assertEquals("Z",removeChara.removeA("Z"));
	}
	@Test
	void testTwoChar() {
		assertEquals("",removeChara.removeA("AA"));
		assertEquals("Z",removeChara.removeA("ZA"));
		assertEquals("Z",removeChara.removeA("AZ"));
		assertEquals("ZZ",removeChara.removeA("ZZ"));
	}
	@Test
	void testNChar() {
		assertEquals("ZZF",removeChara.removeA("AZZF"));
		assertEquals("SAS",removeChara.removeA("ASAS"));
		assertEquals("BD",removeChara.removeA("BAD"));
		assertEquals("WIN",removeChara.removeA("WIN"));
		assertEquals("BAA",removeChara.removeA("AABAA"));
	}

}
