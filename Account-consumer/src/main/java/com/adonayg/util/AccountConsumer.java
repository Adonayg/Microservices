package com.adonayg.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.adonayg.domain.AccountMessage;
import com.adonayg.service.ConsumerService;

@Component
public class AccountConsumer {

	@Autowired
	private ConsumerService service;

	@JmsListener(destination = "${db.name}", containerFactory = "${db.factory}")
	public void receiveMessage(AccountMessage account) {
		// Will get Illegal pattern character 't' if "yyyy.MM.dd.HH.mm.ss" is moved in
		// to application properties.
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		account.setDate(timestamp);
		service.add(account);
	}

}
