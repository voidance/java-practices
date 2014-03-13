package com.github.best.practices.patterns.decorator;

public class Hobbit extends Character {

	@Override
	public String getDescription() {
		return "Hobbit";
	}
	
	@Override
	public int calculateWarmLevel() {
		return 2;
	}

}
