package com.github.best.practices.patterns.composite;

import org.testng.annotations.Test;

public class MagicSpellComponentTest {

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void add() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {};
		magicSpellComponent.add(new MagicSpellComposite("wont reach", "exception will be thrown"));
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void getChild() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {};
		magicSpellComponent.getChild(0);
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void getDescription() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {};
		magicSpellComponent.getDescription();
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void getName() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {
		};
		magicSpellComponent.getName();
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void print() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {
		};
		magicSpellComponent.print();
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void remove() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {
		};
		magicSpellComponent.remove(new MagicSpellComposite("no name", "description"));
	}
}
