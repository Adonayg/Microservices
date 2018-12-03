package com.gareth.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gareth.domain.Prize;
import com.gareth.service.PrizeService;
import com.gareth.test.constants.TestConstants;

public class PrizeControllerTest {

	@InjectMocks
	PrizeController controller;

	@Mock
	PrizeService service;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void PrizeControllerATest() {
		Prize prize = new Prize();
		prize.setWinner(true);
		when(service.getPrize(TestConstants.A_ACCOUNT_NUMBER)).thenReturn(prize);
		Prize getprize = controller.getPrize(TestConstants.A_ACCOUNT_NUMBER);
		assertEquals(getprize.isWinner(), true);
	}

	@Test
	public void PrizeControllerBTest() {
		Prize prize = new Prize();
		prize.setWinner(true);
		when(service.getPrize(TestConstants.B_ACCOUNT_NUMBER)).thenReturn(prize);
		Prize getprize = controller.getPrize(TestConstants.B_ACCOUNT_NUMBER);
		assertEquals(getprize.isWinner(), true);
	}

	@Test
	public void PrizeControllerCTest() {
		Prize prize = new Prize();
		prize.setWinner(false);
		when(service.getPrize(TestConstants.C_ACCOUNT_NUMBER)).thenReturn(prize);
		Prize getprize = controller.getPrize(TestConstants.C_ACCOUNT_NUMBER);
		assertEquals(getprize.isWinner(), false);
	}

}
