package com.github.best.practices.patterns.state;

import org.testng.annotations.Test;

public class OrcTest {
	@Test
	public void f() {
		Orc  orc = new Orc();
		orc.eat();
		orc.eat();
		orc.defecate();
		orc.defecate();
	}
}
