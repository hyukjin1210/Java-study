package day05.bankapp.bank;

import java.util.ArrayList;
import java.util.List;

public class AccountList {  //데이터베이스의 역할
    private static final List<Account> accountList = new ArrayList<>();

    public static List<Account> getAccountList () {
        return accountList;
    }

}
