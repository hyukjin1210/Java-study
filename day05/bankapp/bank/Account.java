package day05.bankapp.bank;

import java.util.Date;

public class Account {  //실제 사용자가 요청한 것에 대한 비즈니스 로직
    private String username;
    private String password;
    private double balance; //현재 계좌의 잔고
    private Date expirationDate;    //만료일\

    public Account(String username, String password, double cash, Date date) {

    }

    // 계좌 개설하는 메서드
    public Account createAccount(String username, String password, double cash) {
        Account account = new Account(username, password, cash, new Date(
                System.currentTimeMillis() + (1000 * 24 * 60 * 60000L)));

        return null;
    }
}
