package com.adonayg.service;

import java.util.Optional;

import com.adonayg.domain.Account;
import com.adonayg.domain.Prize;
import com.adonayg.repository.AccountRepository;

public interface IAccountService {

	Iterable<Account> getAll();

	String delete(Long id);

	Optional<Account> get(Long id);

	Account add(Account account);
	
	Prize prizeCheck(String accountNumber);

	void setRepo(AccountRepository accountRepo);
	
}