package com.github.best.practices.patterns.observer;

import java.util.Observable;

public class Altimeter extends Observable {

	private int altitude;

	public Altimeter() {}
	
	public void altitudeChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void modifyAltitude(int altitude) {
		this.altitude = altitude;
		altitudeChanged();
	}

	public int getAltitude() {
		return altitude;
	}
}
