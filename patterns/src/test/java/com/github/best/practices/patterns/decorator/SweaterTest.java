package com.github.best.practices.patterns.decorator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SweaterTest {
	@Test
	public void hobbitWarmTest() {
		Character hobbit = new Hobbit();
		
		Assert.assertEquals(hobbit.calculateWarmLevel(), 2);
		
		Sweater sweater = new Sweater(hobbit);
		Assert.assertEquals(sweater.calculateWarmLevel(), 7);
	}
}
