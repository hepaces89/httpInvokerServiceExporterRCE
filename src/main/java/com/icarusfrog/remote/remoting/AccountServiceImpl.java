package com.icarusfrog.remote.remoting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    HashMap<String, List<Account>> store = new HashMap<>();

    @Override
    public void insertAccount(Account account) {
        List<Account> existingAccounts = store.getOrDefault(account.getName(), new ArrayList<>());
        existingAccounts.add(account);
        store.put(account.getName(), existingAccounts);
    }

    @Override
    public List<Account> getAccounts(String name) {
        return store.getOrDefault(name, new ArrayList<>());
    }
}
