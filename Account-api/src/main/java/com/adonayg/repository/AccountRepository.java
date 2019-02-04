package com.adonayg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adonayg.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
