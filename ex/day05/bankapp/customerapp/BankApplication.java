package ex.day05.bankapp.customerapp;

import ex.day05.bankapp.bankinterface.AccountInterface;

public class BankApplication implements AccountInterface {
    @Override
    public String accountInfo() {
        return null;
    }

    @Override
    public double accountTransfer(double cash) {
        return 0;
    }

    @Override
    public double depositToAccount(double cash) {
        return 0;
    }

    @Override
    public double withdrawFromAccount(double cash) {
        return 0;
    }
}
