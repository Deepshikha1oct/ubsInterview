package com.ubs.opsit.interviews.time.convertors;

import com.ubs.opsit.interviews.constants.BerlinClockRows;
import com.ubs.opsit.interviews.constants.Lamps;
import com.ubs.opsit.interviews.time.utility.TimeConverterUtility;

public class MinutesConvertor {

	public String convertMinutes( String minutes) {
		int minutesInt = TimeConverterUtility.convertStringToInt(minutes);
	String	sb = TimeConverterUtility.returnBerlinClockRow(TimeConverterUtility.getQuotient(minutesInt, 5), 
				Lamps.YELLOW, BerlinClockRows.MINUTES_FIRST_ROW);

		sb = sb+TimeConverterUtility.returnBerlinClockRow(TimeConverterUtility.getRemainder(minutesInt, 5), 
				Lamps.YELLOW, BerlinClockRows.MINUTES_SECOND_ROW);

		return sb;

	}

}
