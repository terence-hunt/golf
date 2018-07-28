package com.golf.golfCourse;

import com.golf.config;
import com.golf.config.distanceUnit;

public class HoleLength {
	long yardage;
	public static final double YARD2METER = .9144;
	
	public void setHoleYardage(long yardage ) {
		this.yardage = yardage;
	}
	
	public void setHoleMeterage(long meterage) {
		yardage = Math.round(meterage / YARD2METER);
	}
	
	
	public long getHoleLength() {
		if (config.getUnit() == distanceUnit.METERS ) {
			return  Math.round(yardage * YARD2METER);
			
		}
		else return yardage;
	}
	

}
