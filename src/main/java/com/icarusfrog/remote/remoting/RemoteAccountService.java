package com.icarusfrog.remote.remoting;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RemoteAccountService extends Remote {
    public void insertAcount(Account account) throws RemoteException;
    public List<Account> getAccounts(String name) throws RemoteException;
}
