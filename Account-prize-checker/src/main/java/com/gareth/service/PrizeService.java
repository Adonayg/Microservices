package com.gareth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.domain.Prize;
import com.gareth.util.PrizeChecker;

@Service
public class PrizeService implements IPrizeService {

	@Autowired
	private PrizeChecker checker;

	public Prize getPrize(String accountNumber) {
		return checker.checkPrize(accountNumber);
	}
}
