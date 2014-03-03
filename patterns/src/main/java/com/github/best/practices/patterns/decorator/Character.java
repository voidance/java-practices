package com.github.best.practices.patterns.decorator;

public abstract class Character {
	private String description = "";
	private int warmLevel;
	
	public String getDescription() {
		return description;
	}

	public int getWarmLevel() {
		return warmLevel;
	}

	public abstract int calculateWarmLevel();

}
