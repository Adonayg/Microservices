package com.adonayg.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.adonayg.domain.Account;
import com.adonayg.domain.AccountMessage;

@Component
public class AccountProducer {

	private AccountMessage accountMessage = new AccountMessage();

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${que.name}")
	private String queName;

	public String produce(Account account) {
		accountMessage.setAccount(account.toString());
		jmsTemplate.convertAndSend(queName, accountMessage);
		return "${successful.message}";
	}
}
