package com.adonayg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.util.LetterGenerator;
import com.adonayg.util.NumberGenerator;

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
