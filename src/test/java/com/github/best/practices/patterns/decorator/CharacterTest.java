package com.github.best.practices.patterns.decorator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CharacterTest {

	Character character;

	@BeforeTest
	public void init() {
		character = new Character() {

			@Override
			public int calculateWarmLevel() {
				return 0;
			}
		};

	}

	@Test
	public void calculateWarmLevel() {
		Assert.assertEquals(character.calculateWarmLevel(), 0);
	}

	@Test
	public void getDescription() {
		Assert.assertEquals(character.getDescription(), "");
	}

	@Test
	public void getWarmLevel() {
		Assert.assertEquals(character.getWarmLevel(), 0);
	}
}
