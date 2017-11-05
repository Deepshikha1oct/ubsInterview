package com.ubs.opsit.interviews.time.validator;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class TimeValidatorTest {

	
	@InjectMocks
	TimeValidator timeValidator;

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testValidateTimeFormat() {
		String time = "14:49";
		when(timeValidator.validate(time)).thenThrow(new IllegalArgumentException());

	}
	@Test(expected=IllegalArgumentException.class)
	public void testValidateMinutesRange() {
		String time = "14:80:40";
		when(timeValidator.validate(time)).thenThrow(new IllegalArgumentException());

	}
	@Test(expected=IllegalArgumentException.class)
	public void testValidateSecondsRange() {
		String time = "14:59:60";
		when(timeValidator.validate(time)).thenThrow(new IllegalArgumentException());

	}
	@Test(expected=IllegalArgumentException.class)
	public void testValidateHoursRange() {
		String time = "25:59:60";
		when(timeValidator.validate(time)).thenThrow(new IllegalArgumentException());

	}
	@Test(expected=IllegalArgumentException.class)
	public void testValidateIntFormat() {
		String time = "aa:bb:60";
		when(timeValidator.validate(time)).thenThrow(new IllegalArgumentException());

	}

}
