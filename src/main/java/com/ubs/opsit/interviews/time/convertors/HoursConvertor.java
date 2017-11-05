package com.ubs.opsit.interviews.time.convertors;

import com.ubs.opsit.interviews.constants.BerlinClockRows;
import com.ubs.opsit.interviews.constants.Lamps;
import com.ubs.opsit.interviews.time.utility.TimeConverterUtility;

public class HoursConvertor {

	public String convertHoursToBerlinClockHours(String hours) {
		int hoursInt = TimeConverterUtility.convertStringToInt(hours);

		String str = TimeConverterUtility.returnBerlinClockRow(TimeConverterUtility.getQuotient(hoursInt, 5), Lamps.RED,
				BerlinClockRows.HOURS_ROW);
		str = str+TimeConverterUtility.returnBerlinClockRow(TimeConverterUtility.getRemainder(hoursInt, 5), Lamps.RED,
				BerlinClockRows.HOURS_ROW);
		return str;
	}

}
