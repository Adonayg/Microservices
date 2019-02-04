package com.adonayg.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.adonayg.domain.Prize;

@Component
public class AccountRestTemplate {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${URL.generator.base}" + "${URL.generator.method}")
	private String accountNumberGeneratorURL;

	@Value("${URL.prize.base}" + "${URL.prize.method}")
	private String prizeCheckerURL;
	
	public String getAccountNumber() {
		return restTemplate.getForObject(accountNumberGeneratorURL, String.class);
	}

	public Prize getPrize(String accountNumber) {
		return restTemplate.getForObject(prizeCheckerURL + accountNumber, Prize.class);
	}
}
