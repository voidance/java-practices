package com.github.best.practices.patterns.composite;

public class Mage {
	private MagicSpellComponent allMagicSpells;

	public Mage(MagicSpellComponent allMagicSpells) {
		this.allMagicSpells = allMagicSpells;
	}
	
	public void printMagicSpells() {
		allMagicSpells.print();
	}
}
