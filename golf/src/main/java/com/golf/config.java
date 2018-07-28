package com.golf;

public class config {
	public enum distanceUnit{YARDS,METERS}
	private static distanceUnit unit = distanceUnit.YARDS;
	
	
	
	public static distanceUnit getUnit() {
		return unit;
	}
	public static void setUnit(distanceUnit u) {
		unit = u;
	}
	
}
