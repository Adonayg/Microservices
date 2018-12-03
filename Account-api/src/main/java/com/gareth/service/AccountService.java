package com.gareth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.domain.Account;
import com.gareth.repository.AccountRepository;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private AccountRepository accountRepo;

	public Iterable<Account> getAll() {
		return accountRepo.findAll();
	}

	public String delete(Long id) {
		accountRepo.deleteById(id);
		return "${delete.message}";
	}

	public Optional<Account> get(Long id) {
		return accountRepo.findById(id);
	}

	public Account add(Account account) {
		return accountRepo.save(account);
	}

	public void setRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}
}
