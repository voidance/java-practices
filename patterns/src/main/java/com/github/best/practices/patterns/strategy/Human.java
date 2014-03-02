package com.github.best.practices.patterns.strategy;

public class Human extends Character {
	public Human(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
	}

	@Override
	public String fight() {
		return toString() + super.fight();
	}
	
	@Override
	public String toString() {
		return "I'm a Human ";
	}

}
