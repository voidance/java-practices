package com.github.best.practices.patterns.strategy;

public class SwordBehavior implements WeaponBehavior {

	public String useWeapon() {
		return FightingBehaviorEnum.SWORD.toString();
	}

}
