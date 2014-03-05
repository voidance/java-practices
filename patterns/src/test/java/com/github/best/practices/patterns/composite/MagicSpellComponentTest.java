package com.github.best.practices.patterns.composite;

import java.util.Iterator;

import org.testng.annotations.Test;

public class MagicSpellComponentTest {

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void add() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {

			@Override
			public Iterator<MagicSpellComponent> createIterator() {
				// TODO Auto-generated method stub
				return null;
			}};
		magicSpellComponent.add(new MagicSpellComposite("wont reach", "exception will be thrown"));
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void getChild() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {

			@Override
			public Iterator<MagicSpellComponent> createIterator() {
				// TODO Auto-generated method stub
				return null;
			}};
		magicSpellComponent.getChild(0);
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void getDescription() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {

			@Override
			public Iterator<MagicSpellComponent> createIterator() {
				// TODO Auto-generated method stub
				return null;
			}};
		magicSpellComponent.getDescription();
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void getName() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {

			@Override
			public Iterator<MagicSpellComponent> createIterator() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		magicSpellComponent.getName();
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void print() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {

			@Override
			public Iterator<MagicSpellComponent> createIterator() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		magicSpellComponent.print();
	}

	@Test(expectedExceptions = UnsupportedOperationException.class)
	public void remove() {
		MagicSpellComponent magicSpellComponent = new MagicSpellComponent() {

			@Override
			public Iterator<MagicSpellComponent> createIterator() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		magicSpellComponent.remove(new MagicSpellComposite("no name", "description"));
	}
}
