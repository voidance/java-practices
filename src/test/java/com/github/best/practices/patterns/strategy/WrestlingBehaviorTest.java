package com.github.best.practices.patterns.strategy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WrestlingBehaviorTest {

	@Test
	public void useWeapon() {
		WrestlingBehavior wrestlingBehavior = new WrestlingBehavior();
		Assert.assertEquals(wrestlingBehavior.useWeapon(), FightingBehaviorEnum.WRESTLING.toString());
	}
}
