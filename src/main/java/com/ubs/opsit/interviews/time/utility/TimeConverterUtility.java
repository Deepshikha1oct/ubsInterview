package com.ubs.opsit.interviews.time.utility;

import com.ubs.opsit.interviews.constants.BerlinClockRows;
import com.ubs.opsit.interviews.constants.Lamps;

public class TimeConverterUtility {

	public static String returnBerlinClockRow(int value, Lamps lamp, BerlinClockRows clockRows) {
		String string = "";
		if (clockRows.equals(BerlinClockRows.SECONDS_ROW)) {
			string = returnOneLampRow(value, lamp);
		}
		if (clockRows.equals(BerlinClockRows.MINUTES_SECOND_ROW) || clockRows.equals(BerlinClockRows.HOURS_ROW)) {
			string = returnFourLampRow(value, lamp);
		}
		if (clockRows.equals(BerlinClockRows.MINUTES_FIRST_ROW)) {
			string = returnElevenLampRow(value, lamp);
		}
		return string;
	}

	private static String returnFourLampRow(int value, Lamps lamp) {
		String fourLampRow = "";
		for (int i = 1; i <= 4; i++) {
			if (i <= value) {
				fourLampRow = getLampValue(fourLampRow, lamp);
			} else {
				fourLampRow = getLampValue(fourLampRow, Lamps.OFF);
			}
		}
		fourLampRow = fourLampRow + "\r\n";
		return fourLampRow;
	}

	private static String returnElevenLampRow(int value, Lamps lamp) {
		String elevenLampRow = "";
		for (int i = 1; i <= 11; i++) {
			if (i <= value) {
				if (i % 3 == 0) {
					elevenLampRow = TimeConverterUtility.getLampValue(elevenLampRow, Lamps.RED);
				} else {
					elevenLampRow = TimeConverterUtility.getLampValue(elevenLampRow, Lamps.YELLOW);
				}
			} else {
				elevenLampRow = TimeConverterUtility.getLampValue(elevenLampRow, Lamps.OFF);
			}
		}
		elevenLampRow = elevenLampRow + "\r\n";
		return elevenLampRow;
	}

	private static String returnOneLampRow(int value, Lamps lamp) {
		String secondsLampRow="";
		if (value % 2 == 0) {
			secondsLampRow = TimeConverterUtility.getLampValue(secondsLampRow, Lamps.YELLOW);
		} else {
			secondsLampRow = TimeConverterUtility.getLampValue(secondsLampRow, Lamps.OFF);
		}
		secondsLampRow = secondsLampRow + "\r\n";
		return secondsLampRow;
	}

	public static String getLampValue(String rowString, Lamps lamp) {
		rowString = rowString + lamp.getLampValue();
		return rowString;
	}

	public static int getQuotient(int dividend, int divisor) {
		return dividend / divisor;
	}

	public static int getRemainder(int dividend, int divisor) {
		return dividend % divisor;
	}

	public static int convertStringToInt(String value) {
		int integerValue;
		try {
			integerValue = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Time values must be numeric.");
		}
		return integerValue;

	}
}
