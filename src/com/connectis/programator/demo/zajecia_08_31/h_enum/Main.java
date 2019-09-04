package com.connectis.programator.demo.zajecia_08_31.h_enum;

public class Main {

	public static void main(String[] args) {
		System.out.println(DaysOfWeek.MONDAY);

		String mondayName = DaysOfWeek.MONDAY.name();
		System.out.println(mondayName);

		String mondayString = "MONDAY";
		DaysOfWeek monday = DaysOfWeek.valueOf(mondayString);
		System.out.println(monday);

		for (DaysOfWeek dayOfWeek : DaysOfWeek.values()) {
			System.out.println(dayOfWeek + ": " + dayOfWeek.getShortName());
		}

		switch (getDay()) {
			case MONDAY:
				break;
			case TUESDAY:
				break;
			case WEDNESDAY:
				break;
			case THURSDAY:
				break;
			case FRIDAY:
				break;
			case SATURDAY:
				break;
			case SUNDAY:
				break;
			default:
				throw new IllegalArgumentException();
		}
	}

	private static DaysOfWeek getDay() {
		return DaysOfWeek.FRIDAY;
	}
}
