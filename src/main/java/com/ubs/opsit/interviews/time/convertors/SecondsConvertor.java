package com.ubs.opsit.interviews.time.convertors;

import com.ubs.opsit.interviews.constants.BerlinClockRows;
import com.ubs.opsit.interviews.constants.Lamps;
import com.ubs.opsit.interviews.time.utility.TimeConverterUtility;

public class SecondsConvertor {

	public String convertSecondsToBerlinClockSeconds(String seconds) {
		return TimeConverterUtility.returnBerlinClockRow(TimeConverterUtility.convertStringToInt(seconds), Lamps.RED,
				BerlinClockRows.SECONDS_ROW);

	}

}
