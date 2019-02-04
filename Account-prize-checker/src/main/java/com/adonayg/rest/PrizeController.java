package com.adonayg.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adonayg.domain.Prize;
import com.adonayg.service.IPrizeService;

@RestController
public class PrizeController {

	@Autowired
	private IPrizeService service;

	@RequestMapping("${URL.method}")
	public Prize getPrize(@PathVariable String accountNumber) {
		Prize prize = service.getPrize(accountNumber);
		return prize;
	}
}
