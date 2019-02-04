package com.adonayg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.domain.Account;
import com.adonayg.domain.Prize;
import com.adonayg.repository.AccountRepository;
import com.adonayg.util.AccountRestTemplate;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private AccountRepository accountRepo;

	@Autowired
	private AccountRestTemplate apiCaller;

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
		account.setAccountNumber(apiCaller.getAccountNumber());
		account.setPrize(apiCaller.getPrize(account.getAccountNumber()));
		return accountRepo.save(account);
	}

	public Prize prizeCheck(String accountNumber) {
		return apiCaller.getPrize(accountNumber);
	}

	public void setRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}
}
