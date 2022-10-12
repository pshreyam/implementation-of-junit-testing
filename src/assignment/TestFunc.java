package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFunc {
	Student shreyam = new Student();
	
	@Test
	void test_name() {
		assertEquals(shreyam.get_name(), "Shreyam Pokharel");
	}
	
	@Test
	void test_roll() {
		assertEquals(shreyam.get_roll(), 40);
		assertNotEquals(shreyam.get_roll(), 41);
	}
	
	@Test
	void test_department() {
		assertEquals(shreyam.get_department(), "CE");
	}
}