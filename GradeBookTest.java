import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook gb1;
	GradeBook gb2;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
		gb1 = new GradeBook(5);
		gb1.addScore(89);
		gb1.addScore(91);
		gb1.addScore(75);
		gb1.addScore(100);
		gb1.addScore(50);
		
		gb2 = new GradeBook(5);
		gb2.addScore(65);
		gb2.addScore(73);
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
		gb1 = null;
		gb2 = null;
	}

	@Test
	public void testAddScore() 
	{
		assertTrue(gb1.toString().equals("89.0 91.0 75.0 100.0 50.0 "));
		assertTrue(gb2.toString().equals("65.0 73.0 "));
		
		assertEquals(5, gb1.getScoresSize());
		assertEquals(2, gb2.getScoresSize());
	}

	@Test
	public void testSum() {
		assertEquals(405, gb1.sum());
		assertEquals(138, gb2.sum());
	}

	@Test
	public void testMinimum() {
		assertEquals(50, gb1.minimum());
		assertEquals(65, gb2.minimum());
	}

	@Test
	public void testFinalScore() {
		assertEquals(355, gb1.finalScore());
		assertEquals(73, gb2.finalScore());
	}
}
