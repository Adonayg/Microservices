package com.adonayg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.domain.AccountMessage;
import com.adonayg.repository.ConsumerRepository;

@Service
public class ConsumerService {

	@Autowired
	private ConsumerRepository consumerRepo;

	public void setRepo(ConsumerRepository consumerRepo) {
		this.consumerRepo = consumerRepo;
	}

	public Iterable<AccountMessage> getAll() {
		return consumerRepo.findAll();
	}

	public AccountMessage add(AccountMessage account) {
		return consumerRepo.save(account);
	}

	public void delete(Long id) {
		consumerRepo.deleteById(id);
	}

	public Optional<AccountMessage> get(Long id) {
		return consumerRepo.findById(id);
	}

}