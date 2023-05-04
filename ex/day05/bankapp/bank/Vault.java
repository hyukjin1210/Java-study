package ex.day05.bankapp.bank;

public class Vault {    //은행 금고 정보 데이터베이스 역할 겸 비즈니스 로직
    private static double vaultCash;

    static {
        vaultCash = 999_999_999;
    }

    //금고 현금 잔액을 반환하는 메서드
    public double getVaultCash() {
        return vaultCash;
    }

    //금고에서 현금 출력
    public double withdrawCashFromVault(double cash) {
        // 현재 금고 잔액 = cash < 0
        if (vaultCash - cash < 0) {
            System.out.println("금고의 현금이 부족합니다.");
            return 0;
        } else {
            vaultCash -= cash;
            return cash;
        }
    }

    //금고에 현금 입금
    public double depositCashToVault(double cash) {
        vaultCash = vaultCash + cash;
        return vaultCash;
    }

}
