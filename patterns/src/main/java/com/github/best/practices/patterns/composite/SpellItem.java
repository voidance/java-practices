package com.github.best.practices.patterns.composite;

import java.util.Iterator;

/*MenuItem*/
public class SpellItem extends MagicSpellComponent {
	private String name;
	private String description;
	private int price;

	public SpellItem(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public void print() {
		System.out.println("Price " + price + " description " + description);
	}

	@Override
	public Iterator<MagicSpellComponent> createIterator() {
		return new NullIterator();
	}

}
