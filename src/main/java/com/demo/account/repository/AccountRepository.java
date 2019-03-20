package com.demo.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.account.entity.Account;

public interface AccountRepository
  extends CrudRepository<Account, Long> {
	
	@Query("FROM Account a where a.clientNo = :clientNo") 
    List<Account> findByCustId(@Param("clientNo") String clientNo);
}