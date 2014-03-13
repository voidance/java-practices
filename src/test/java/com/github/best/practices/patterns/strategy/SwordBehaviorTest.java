package com.github.best.practices.patterns.strategy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwordBehaviorTest {

	@Test
	public void useWeapon() {
		SwordBehavior swordBehavior = new SwordBehavior();
		Assert.assertEquals(swordBehavior.useWeapon(), FightingBehaviorEnum.SWORD.toString());
	}
}
