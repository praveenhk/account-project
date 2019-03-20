package com.demo.account.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.account.dto.AccountDTO;
import com.demo.account.dto.TransactionDTO;
import com.demo.account.entity.Account;
import com.demo.account.entity.Transaction;
import com.demo.account.repository.AccountRepository;
import com.demo.account.repository.TransactionRepository;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@Autowired
    private ModelMapper modelMapper;
 
	public List<AccountDTO> getAcctList(String clientNo) {
		List<Account> acctList = accountRepository.findByCustId(clientNo);
		return acctList.stream()
        .map(acct -> modelMapper.map(acct,AccountDTO.class))
        .collect(Collectors.toList());
	}
	
	public List<TransactionDTO> getAccountTxnList(String acctNo) {
		List<Transaction> acctTxnList = transactionRepository.findByAcctNo(acctNo);
		return acctTxnList.stream()
        .map(txn -> modelMapper.map(txn,TransactionDTO.class))
        .collect(Collectors.toList());
	}
}
