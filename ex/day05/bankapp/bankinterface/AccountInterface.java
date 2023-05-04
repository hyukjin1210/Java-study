package ex.day05.bankapp.bankinterface;

public interface AccountInterface { //고객용
    //계좌 정보 출력
    //계좌 송금
    //계좌 예금
    //계좌 출금

    String accountInfo();
    double accountTransfer(double cash);
    double depositToAccount(double cash);
    double withdrawFromAccount(double cash);
}
