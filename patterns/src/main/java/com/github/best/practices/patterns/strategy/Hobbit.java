package com.github.best.practices.patterns.strategy;

public class Hobbit extends Character {

	public Hobbit(WeaponBehavior weaponBehavior) {
		super(weaponBehavior);
	}

	@Override
	public String fight() {
		return toString() + super.fight();
	}
	
	@Override
	public String toString() {
		return "I'm a Hobbit ";
	}
}
