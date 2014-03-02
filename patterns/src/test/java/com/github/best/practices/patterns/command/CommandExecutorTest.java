package com.github.best.practices.patterns.command;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommandExecutorTest {

	@Test
	public void hobbitMoveToNextCityTest() {
		CommandExecutor commandExecutor = new CommandExecutor();
		Hobbit hobbit = new Hobbit();
		MoveToNextCityCommand moveToNextCityCommand = new MoveToNextCityCommand(hobbit);

		commandExecutor.setCommand(moveToNextCityCommand);
		commandExecutor.execute();
		Assert.assertEquals(hobbit.isMoved(), true);
	}
}
