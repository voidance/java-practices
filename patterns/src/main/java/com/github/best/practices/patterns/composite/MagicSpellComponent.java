package com.github.best.practices.patterns.composite;

public abstract class MagicSpellComponent {
	public void add(MagicSpellComponent magicSpellComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MagicSpellComponent magicSpellComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MagicSpellComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
}
