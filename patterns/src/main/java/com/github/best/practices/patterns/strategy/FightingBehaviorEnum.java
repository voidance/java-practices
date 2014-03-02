package com.github.best.practices.patterns.strategy;

public enum FightingBehaviorEnum {
	WRESTLING("Fighting with fists"), SWORD("Fighting with a sword");
	
	private final String fightBehavior;
	private FightingBehaviorEnum(String fightBehavior) {
		this.fightBehavior = fightBehavior;
	}

	@Override
	public String toString() {
		return fightBehavior;
	}
}
