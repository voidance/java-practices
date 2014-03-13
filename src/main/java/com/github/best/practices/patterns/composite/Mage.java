package com.github.best.practices.patterns.composite;

import java.util.Iterator;

public class Mage {
	private MagicSpellComponent allMagicSpells;

	public Mage(MagicSpellComponent allMagicSpells) {
		this.allMagicSpells = allMagicSpells;
	}

	public void printMagicSpells() {
		allMagicSpells.print();
	}

	public void printAll() {
		Iterator<MagicSpellComponent> iterator = allMagicSpells.createIterator();
		while (iterator.hasNext()) {
			MagicSpellComponent next = iterator.next();
			try {
				next.print();
			} catch (UnsupportedOperationException e) {
			}
		}
	}
}
