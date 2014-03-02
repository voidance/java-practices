package com.github.best.practices.patterns.strategy;

public abstract class Character {
	protected WeaponBehavior weaponBehavior;

	public Character(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	public String fight() {
		return weaponBehavior.useWeapon();
	}

}
