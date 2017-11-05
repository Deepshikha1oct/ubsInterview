package com.ubs.opsit.interviews.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.ubs.opsit.interviews.impl.TimeConverterImpl;
import com.ubs.opsit.interviews.time.utility.TimeConverterUtility;
import com.ubs.opsit.interviews.time.validator.TimeValidator;

@RunWith(MockitoJUnitRunner.class)
public class TimeConverterImplTest {
	@Mock
	TimeConverterUtility timeConverterUtility;
	@Mock
	TimeValidator timeValidator;

	@InjectMocks
	TimeConverterImpl timeConverterImpl;

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testConvertTime() {
		String time = "14:49:02";
		String expected = "Y\r\nRROO\r\nRRRR\r\nYYRYYRYYROO\r\nYYYY";
		assertEquals(timeConverterImpl.convertTime(time), expected);

	}

}
