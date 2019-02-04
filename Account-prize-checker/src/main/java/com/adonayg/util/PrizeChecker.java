package com.adonayg.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.adonayg.domain.Prize;

@Component
public class PrizeChecker {

	@Value("${prize.base}")
	private int basePrize;

	@Value("${prize.multiplier}")
	private int multiplier;

	@Value("${message.win}")
	private String winMessage;

	@Value("${message.lose}")
	private String loseMessage;
	

	public Prize checkPrize(String accountNumber) {
		String letter = accountNumber.substring(0, 1);
		switch (letter) {
		case PrizeConstants.basePrize:
			return new Prize(winMessage + String.valueOf(basePrize), true);
		case PrizeConstants.multiplierPrize:
			return new Prize(winMessage + String.valueOf(multiplier * basePrize), true);
		default:
			return new Prize(loseMessage, false);	
		}
	}
}
