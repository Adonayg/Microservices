package com.adonayg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adonayg.domain.AccountMessage;

public interface ConsumerRepository extends MongoRepository <AccountMessage, Long> {

}
