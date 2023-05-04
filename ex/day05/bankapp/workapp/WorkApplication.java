package ex.day05.bankapp.workapp;

import ex.day05.bankapp.bank.Account;
import ex.day05.bankapp.bank.Vault;
import ex.day05.bankapp.bankinterface.WorkInterface;

public class WorkApplication implements WorkInterface { //컨트롤러의 역할
    @Override
    public double withdrawCashFromVault(double cash) {
        Vault vault = new Vault();
        return vault.withdrawCashFromVault(cash);
    }

    @Override
    public double depositCashToVault(double cash) {
        Vault vault = new Vault();
        return vault.depositCashToVault(cash);
    }

    @Override
    public Account getAccountInfo(String username, String password) {
        return null;
    }

    @Override
    public Account createAccount(String username, String password, double cash) {
        return null;
    }

}
