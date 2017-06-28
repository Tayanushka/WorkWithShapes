package org.itstep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShowOurClenWorkTest {
	
	@Test
	public void testgetTimeInSeconds(){
		CleanManager manager = new CleanManager();
		Flat flat = new Flat();
		long testspendedTime = manager.cleanFlat(flat, 0);
		assertTrue(testspendedTime >= 6000 && testspendedTime <= 7000);
	}

}
