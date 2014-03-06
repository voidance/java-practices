package com.github.best.practices.patterns.state;

public class Orc {
	private HungryState hungryState;
	private FilledState filledState;
	private LifeState state;
	
	public Orc() {
		state = new HungryState(this);
		hungryState = new HungryState(this);
		filledState = new FilledState(this);
	}
	
	public void eat() {
		state.eat();
	}
	
	public void defecate() {
		state.defecate();
	}
	
	public LifeState getFilledState() {
		return filledState;
	}

	public void setState(LifeState state) {
		this.state = state;
	}

	public LifeState getHungryState() {
		return hungryState;
	}
}
