package com.github.best.practices.patterns.composite;

import java.util.Iterator;

public class NullIterator implements Iterator<MagicSpellComponent> {

	public boolean hasNext() {
		return false;
	}

	public MagicSpellComponent next() {
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
