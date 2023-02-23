package day05.bankapp.adminapp;

import day05.bankapp.bank.Account;
import day05.bankapp.bank.AccountList;
import day05.bankapp.bank.Vault;
import day05.bankapp.bankinterface.AdminInterface;

import java.util.List;

public class AdminApplication implements AdminInterface {
    @Override
    public double getVaultCash() {
        Vault vault = new Vault();
        return vault.getVaultCash();
    }

    @Override
    public List<Account> getAccountList() {
        return AccountList.getAccountList();
    }

    public static void main(String[] args) {

    }
}
