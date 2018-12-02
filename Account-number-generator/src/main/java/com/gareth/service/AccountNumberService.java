package com.gareth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.util.LetterGenerator;
import com.gareth.util.NumberGenerator;

@Service
public class AccountNumberService implements IAccountNumberService {
	@Autowired
	private NumberGenerator numberGenerator;

	@Autowired
	private LetterGenerator letterGenerator;

	public String generateAccountNumber() {
		return letterGenerator.generateLetter() + numberGenerator.generateAccountNumber();
	}
}
