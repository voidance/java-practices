package com.github.best.practices.patterns.strategy;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.best.practices.patterns.strategy.FightingBehaviorEnum;
import com.github.best.practices.patterns.strategy.Hobbit;
import com.github.best.practices.patterns.strategy.SwordBehavior;
import com.github.best.practices.patterns.strategy.WrestlingBehavior;
import com.github.best.practices.patterns.strategy.Character;

public class HobbitTest {
	@Test
	public void testHobbitFightWithFists() {
		WrestlingBehavior wrestling = new WrestlingBehavior();
		Character hobbit = new Hobbit(wrestling);
		Assert.assertEquals(hobbit.toString() + FightingBehaviorEnum.WRESTLING.toString(), hobbit.fight());
	}

	@Test
	public void testHobbitFightWithSword() {
		SwordBehavior sword = new SwordBehavior();
		Character hobbit = new Hobbit(sword);
		Assert.assertEquals(hobbit.toString() + FightingBehaviorEnum.SWORD.toString(), hobbit.fight());
	}
}
