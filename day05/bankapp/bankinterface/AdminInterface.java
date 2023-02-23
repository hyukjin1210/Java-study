package day05.bankapp.bankinterface;

import day05.bankapp.bank.Account;

import java.util.List;

public interface AdminInterface {   //관리자용
    // 은행 금고 현금 확인
    // 전체 계좌 목록 확인
    double getVaultCash();
    List<Account> getAccountList();
}
