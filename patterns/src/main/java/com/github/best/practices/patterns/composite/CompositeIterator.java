package com.github.best.practices.patterns.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MagicSpellComponent> {
	private Stack<Iterator<MagicSpellComponent>> stack;

	public CompositeIterator(Iterator<MagicSpellComponent> iterator) {
		this.stack = new Stack<Iterator<MagicSpellComponent>>();
		stack.push(iterator);
	}

	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator<MagicSpellComponent> iterator = (Iterator<MagicSpellComponent>) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public MagicSpellComponent next() {
		if (hasNext()) {
			Iterator<MagicSpellComponent> iterator = stack.peek();
			MagicSpellComponent magicSpellComponent = (MagicSpellComponent) iterator.next();
			if (magicSpellComponent instanceof SpellItem) {
				stack.push(magicSpellComponent.createIterator());
			}
			return magicSpellComponent;
		} else {
			return null;
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
