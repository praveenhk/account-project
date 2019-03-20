package com.demo.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.account.entity.Transaction;

public interface TransactionRepository
  extends CrudRepository<Transaction, Long> { 
	@Query("FROM Transaction t where t.acctNo = :acctNo") 
    List<Transaction> findByAcctNo(@Param("acctNo") String acctNo);
}