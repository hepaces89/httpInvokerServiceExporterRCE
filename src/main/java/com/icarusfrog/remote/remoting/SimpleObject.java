package com.icarusfrog.remote.remoting;

import java.util.List;

public class SimpleObject {
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<Account> getAccountsByName(String name) {
        return accountService.getAccounts(name);
    }

    public void addAccount(Account account) {
        accountService.insertAccount(account);
    }
}
