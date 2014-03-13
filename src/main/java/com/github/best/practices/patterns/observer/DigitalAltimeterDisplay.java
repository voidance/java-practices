package com.github.best.practices.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalAltimeterDisplay implements Observer {
	@SuppressWarnings("unused")
	private Observable observable;
	private int altitude;
	
	public DigitalAltimeterDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof Altimeter) {
			Altimeter altimeter = (Altimeter) o;
			this.altitude = altimeter.getAltitude();
			System.out.println("Altitude is " + altitude);
		}
	}
	
	@Override
	public String toString() {
		return "DigitalAltimeterDisplay has altitude" + altitude;
	}
}
