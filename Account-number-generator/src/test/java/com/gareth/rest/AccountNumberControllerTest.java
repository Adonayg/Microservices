package com.gareth.rest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.adonayg.rest.AccountNumberController;
import com.adonayg.service.AccountNumberService;
import com.gareth.test.constants.TestConstants;

public class AccountNumberControllerTest {

	@InjectMocks
	private AccountNumberController controller;

	@Mock
	private AccountNumberService service;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void accountNumberTest() {

		when(service.generateAccountNumber()).thenReturn(TestConstants.ACCOUNT_NUMBER);

		assertEquals(TestConstants.ACCOUNT_NUMBER, controller.accountNumber());
	}
}
