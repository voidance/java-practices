package com.github.best.practices.patterns.strategy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HumanTest {

	@Test
	public void testHumanFightWithFists() {
		WeaponBehavior fist = new WrestlingBehavior();
		Character human = new Human(fist);
		Assert.assertEquals(human.fight(), human.toString() + FightingBehaviorEnum.WRESTLING.toString());
	}

	@Test
	public void testHumanFightWithSword() {
		WeaponBehavior sword = new SwordBehavior();
		Character human = new Human(sword);
		Assert.assertEquals(human.fight(), human.toString() + FightingBehaviorEnum.SWORD.toString());
	}

}
