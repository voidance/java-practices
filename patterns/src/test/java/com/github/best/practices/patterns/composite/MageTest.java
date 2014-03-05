package com.github.best.practices.patterns.composite;

import org.testng.annotations.Test;

public class MageTest {
	
	
	@Test
	public void f() {
		MagicSpellComponent waterSpells = new MagicSpellComposite("water", "water spells");
		MagicSpellComponent earthSpells = new MagicSpellComposite("earth", "earth spells");
		MagicSpellComponent fireSpells = new MagicSpellComposite("fire", "fire spells");
		
		MagicSpellComponent allSpells = new MagicSpellComposite("all spells", "all spells");
		
		allSpells.add(waterSpells);
		allSpells.add(earthSpells);
		allSpells.add(fireSpells);
		
		waterSpells.add(new SpellItem("wataaa!", "wata spell", 1));
		earthSpells.add(new SpellItem("earthaaa", "earth spell", 3));
		fireSpells.add(new SpellItem("faiaaa", "fire", 0));
		
		Mage mage = new Mage(allSpells);
		mage.printMagicSpells();
		//TODO do real testing
		System.out.println("-----------------------");
		mage.printAll();
	}
}
