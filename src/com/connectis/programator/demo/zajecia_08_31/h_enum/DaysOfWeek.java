package com.connectis.programator.demo.zajecia_08_31.h_enum;

public enum DaysOfWeek {
	MONDAY("MON"),
	TUESDAY("TUE"),
	WEDNESDAY("WED"),
	THURSDAY("THU"),
	FRIDAY("FRI"),
	SATURDAY("SAT"),
	SUNDAY("SUN");

	private String shortName;

	DaysOfWeek(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}
}
