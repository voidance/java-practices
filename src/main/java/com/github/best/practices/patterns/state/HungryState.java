package com.github.best.practices.patterns.state;

public class HungryState implements LifeState {
	private Orc orc;
	
	public HungryState(Orc orc) {
		this.orc = orc;
	}

	public void eat() {
		System.out.println("Eating");
		orc.setState(orc.getFilledState());
	}

	public void defecate() {
		System.out.println("Nothing to defecate while hungry");
	}

}
