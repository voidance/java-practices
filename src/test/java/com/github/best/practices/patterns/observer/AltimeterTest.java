package com.github.best.practices.patterns.observer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AltimeterTest {
	@Test
	public void testObserverAltitudeChanges() {
		Altimeter altimeter = new Altimeter();
		DigitalAltimeterDisplay digitalAltimeterDisplay = new DigitalAltimeterDisplay(altimeter);
		WebAltimeterDisplay webAltimeterDisplay = new WebAltimeterDisplay(altimeter);
		
		int altitude = 1;
		altimeter.modifyAltitude(altitude);
		Assert.assertEquals(digitalAltimeterDisplay.toString(), "DigitalAltimeterDisplay has altitude" + altitude);
		Assert.assertEquals(webAltimeterDisplay.toString(), "WebAltimeterDisplay has altitude" + altitude);
		altitude = 2;
		altimeter.modifyAltitude(altitude);
		Assert.assertEquals(digitalAltimeterDisplay.toString(), "DigitalAltimeterDisplay has altitude" + altitude);
		Assert.assertEquals(webAltimeterDisplay.toString(), "WebAltimeterDisplay has altitude" + altitude);
	}
}
