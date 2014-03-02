package com.github.best.practices.patterns.decorator;

public class Sweater extends WarmDecorator {
	private Character character;
	
	public Sweater(Character character) {
		this.character = character;
	}

	@Override
	public int calculateWarmLevel() {
		return 5 + character.calculateWarmLevel();
	}
	
	@Override
	public String getDescription() {
		return character.getDescription() + ", Sweater";
	}
}
