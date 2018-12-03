package com.gareth.service;

import java.util.Optional;

import com.gareth.domain.Account;
import com.gareth.domain.Prize;
import com.gareth.repository.AccountRepository;

public interface IAccountService {

	Iterable<Account> getAll();

	String delete(Long id);

	Optional<Account> get(Long id);

	Account add(Account account);
	
	Prize prizeCheck(String accountNumber);

	void setRepo(AccountRepository accountRepo);
	
}