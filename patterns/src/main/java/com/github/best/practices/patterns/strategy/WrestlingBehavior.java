package com.github.best.practices.patterns.strategy;

public class WrestlingBehavior implements WeaponBehavior {

	public String useWeapon() {
		return FightingBehaviorEnum.WRESTLING.toString();
	}

}
