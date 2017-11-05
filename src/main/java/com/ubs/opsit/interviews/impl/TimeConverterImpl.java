package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.time.convertors.HoursConvertor;
import com.ubs.opsit.interviews.time.convertors.MinutesConvertor;
import com.ubs.opsit.interviews.time.convertors.SecondsConvertor;
import com.ubs.opsit.interviews.time.validator.TimeValidator;

public class TimeConverterImpl implements TimeConverter {
	TimeValidator timeValidator = new TimeValidator();
	SecondsConvertor secondsConvertor = new SecondsConvertor();
	HoursConvertor hoursConvertor = new HoursConvertor();
	MinutesConvertor minutesConvertor = new MinutesConvertor();

	@Override
	public String convertTime(String aTime) {
		timeValidator.validate(aTime);
		String[] timeArray = aTime.split(":");
		String berlinSeconds = secondsConvertor.convertSecondsToBerlinClockSeconds(timeArray[2]);
		String berlinHours = hoursConvertor.convertHoursToBerlinClockHours(timeArray[0]);
		String berlinMinutes = minutesConvertor.convertMinutes(timeArray[1]);
		return berlinSeconds + berlinHours + berlinMinutes.substring(0,berlinMinutes.length()-2);
	}
public static void main(String str[]){
	TimeConverterImpl timeConverterImpl = new TimeConverterImpl();
	System.out.println(timeConverterImpl.convertTime("14:49:02"));

}
}
