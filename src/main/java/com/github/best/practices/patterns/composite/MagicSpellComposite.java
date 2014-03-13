package com.github.best.practices.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*Menu*/
public class MagicSpellComposite extends MagicSpellComponent {

	private List<MagicSpellComponent> components;
	private String name;
	private String description;
	private Iterator<MagicSpellComponent> iterator;
	
	public MagicSpellComposite(String name, String description) {
		this.components = new ArrayList<MagicSpellComponent>();
		this.name = name;
		this.description = description;
		this.iterator = null;
	}

	@Override
	public void add(MagicSpellComponent magicSpellComponent) {
		components.add(magicSpellComponent);
	}

	@Override
	public void remove(MagicSpellComponent magicSpellComponent) {
		components.remove(magicSpellComponent);
	}

	@Override
	public MagicSpellComponent getChild(int i) {
		return components.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.println("Name " + name + " description " + description);
		Iterator<MagicSpellComponent> iterator = components.iterator();
		while (iterator.hasNext()) {
			MagicSpellComponent next = iterator.next();
			next.print();
		}
	}
	
	@Override
	public Iterator<MagicSpellComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(components.iterator());
		}
		return iterator;
	}
}
