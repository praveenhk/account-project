package com.demo.account.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.account.dto.AccountDTO;
import com.demo.account.dto.TransactionDTO;
import com.demo.account.service.AccountService;

@RestController
public class AccountDetailsController {
	
	@Autowired
	private AccountService accountService;
	   
    @RequestMapping(value = "/account/{custid}", method = RequestMethod.GET)
    public List<AccountDTO> getAccounts(@PathVariable(value="custid") String custId) {
        return accountService.getAcctList(custId);
    }
    
    @RequestMapping(value = "/account/transactions/{acctno}", method = RequestMethod.GET)
    public List<TransactionDTO> getTransactions(@PathVariable(value="acctno") String acctNo) {
        return accountService.getAccountTxnList(acctNo);
    }
}
