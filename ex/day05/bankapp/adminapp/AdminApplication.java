package ex.day05.bankapp.adminapp;

import ex.day05.bankapp.bank.Account;
import ex.day05.bankapp.bank.AccountList;
import ex.day05.bankapp.bank.Vault;
import ex.day05.bankapp.bankinterface.AdminInterface;

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
