package com.github.best.practices.patterns.command;

public class Hobbit {
	private boolean moved = false;

	public void walk() {
		setMoved(true);
	}

	public boolean isMoved() {
		return moved;
	}

	public void setMoved(boolean moved) {
		this.moved = moved;
	}
}
