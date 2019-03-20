package com.demo.account.loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.account.entity.Account;
import com.demo.account.entity.Transaction;
import com.demo.account.repository.AccountRepository;
import com.demo.account.repository.TransactionRepository;

@Component
public class AccountDataLoader {

    private AccountRepository accountRepository;
    private TransactionRepository transactionRepository;

    @Autowired
    public AccountDataLoader(AccountRepository accountRepository,TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
        LoadAccounts();
        LoadTransactions();
    }

    private void LoadAccounts() {
    	accountRepository.save(new Account("1000","123-0927382","Sam's Savings","Savings","20 Mar 2019","AUD","980.98"));
    	accountRepository.save(new Account("1000","123-8348202","Sam's Current","Current","19 Mar 2019","AUD","4500.90"));
    	accountRepository.save(new Account("1001","123-8820247","Tom's Savings","Savings","10 May 2018","AUD","10098.78"));
    	accountRepository.save(new Account("1001","123-7823728","Tom's USD Acct","Savings","09 Apr 2018","USD","45.00"));
    	accountRepository.save(new Account("1002","123-1928382","Liam Savings","Savings","31 Jan 2019","AUD","24.9"));
    }
    
    private void LoadTransactions() {
    	transactionRepository.save(new Transaction("123-0927382","AUD","Dr","20 Mar 2019","19.12","EFTPOS Coles"));
    	transactionRepository.save(new Transaction("123-0927382","AUD","Cr","11 Mar 2019","10.00","Paypal refund"));
    	transactionRepository.save(new Transaction("123-0927382","AUD","Dr","09 Mar 2019","10.00","Paypl"));
    	
    	transactionRepository.save(new Transaction("123-8348202","AUD","Cr","19 Mar 2019","500.90","From current account"));
    	transactionRepository.save(new Transaction("123-8348202","AUD","Cr","11 Feb 2019","100.00","Self"));
    	
    	transactionRepository.save(new Transaction("123-8820247","AUD","Dr","10 May 2018","11.01","EFTPOS 1"));
    	transactionRepository.save(new Transaction("123-8820247","AUD","Dr","09 Jan 2018","300,12","EFTPOS 2"));
    	transactionRepository.save(new Transaction("123-8820247","AUD","Dr","22 Sep 2017","439.10","EFTPOS 3"));
    	
    	transactionRepository.save(new Transaction("123-7823728","USD","Dr","09 Apr 2018","455.00","Flight Ticket"));
    	transactionRepository.save(new Transaction("123-7823728","USD","Cr","01 Jan 2018","500.00","USD account transfer"));
    	
    	transactionRepository.save(new Transaction("123-1928382","AUD","Dr","31 Jan 2019","39.89","EFTPOS Coles"));
    	transactionRepository.save(new Transaction("123-1928382","AUD","Dr","19 Dec 2018","13.93","EFTPOS Wollis"));
    	
    }
}