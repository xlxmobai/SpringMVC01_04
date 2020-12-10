package com.service;

import com.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();


    void saveAccount(Account account);
}
