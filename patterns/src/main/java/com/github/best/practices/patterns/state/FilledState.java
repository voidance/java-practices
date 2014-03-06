package com.github.best.practices.patterns.state;

public class FilledState implements LifeState {
	private Orc orc;
	
	public FilledState(Orc orc) {
		this.orc = orc;
	}

	public void eat() {
		System.out.println("Can't eat more");
	}

	public void defecate() {
		System.out.println("Taking a dump");
		orc.setState(orc.getHungryState());
	}

}
