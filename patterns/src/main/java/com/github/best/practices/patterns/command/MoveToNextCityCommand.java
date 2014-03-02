package com.github.best.practices.patterns.command;

public class MoveToNextCityCommand implements Command {
	private Hobbit hobbit;

	public MoveToNextCityCommand(Hobbit hobbit) {
		this.hobbit = hobbit;
	}
	public void execute() {
		hobbit.walk();
	}

}
