package com.adonayg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.domain.Prize;
import com.adonayg.util.PrizeChecker;

@Service
public class PrizeService implements IPrizeService {

	@Autowired
	private PrizeChecker checker;

	public Prize getPrize(String accountNumber) {
		return checker.checkPrize(accountNumber);
	}
}
