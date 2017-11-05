package com.ubs.opsit.interviews.time.validator;

import java.util.regex.Pattern;

import com.ubs.opsit.interviews.time.utility.TimeConverterUtility;

public class TimeValidator {
	private static final String TIME_PATTERN = "..:..:..";

	private final Pattern pattern = Pattern.compile(TIME_PATTERN);

	public boolean validate(String time) {
		validateTimePattern(time);
		String[] timeArray = time.split(":");

		validateHoursRange(timeArray[0]);
		validateMinutesRange(timeArray[1]);
		validateSecondsRange(timeArray[2]);
		return true;
	}

	private void validateHoursRange(String value) {
		int hours = TimeConverterUtility.convertStringToInt(value);
		if (hours < 0 || hours > 24)
			throw new IllegalArgumentException("Hours out of bounds.");
	}

	private void validateMinutesRange(String value) {
		int minutes = TimeConverterUtility.convertStringToInt(value);
		if (minutes < 0 || minutes > 59)
			throw new IllegalArgumentException("Minutes out of bounds.");
	}

	private void validateSecondsRange(String value) {
		int seconds = TimeConverterUtility.convertStringToInt(value);
		if (seconds < 0 || seconds > 59)
			throw new IllegalArgumentException("Seconds out of bounds.");

	}

	public void validateTimePattern(String time) {
		if (!pattern.matcher(time).matches()) {
			throw new IllegalArgumentException("Time is not a valid!");
		}
		String[] timeArray = time.split(":");
		TimeConverterUtility.convertStringToInt(timeArray[0]);
		TimeConverterUtility.convertStringToInt(timeArray[1]);
		TimeConverterUtility.convertStringToInt(timeArray[2]);

	}
}
