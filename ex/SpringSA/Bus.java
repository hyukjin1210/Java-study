package ex.SpringSA;
/*

 */

public class Bus extends transPort {
    private int maxPassenger = 30;
    private boolean status; //상태. (false = 운행 , true = 차고지행)

    public Bus(int number, int price) {
        super(number, price);
    }

    @Override
    public void Info() {
        System.out.println("버스번호: " + Number + ", 기본요금: " + price);
    }

    public void power() {  //버스 상태변경. 체크완료
        status = !status;
    }

    public void statusMode() {  //버스 상태확인. 체크완료
        if (!status) {
            System.out.println("운행");
        } else {
            System.out.println("차고지행");
        }
    }

    @Override
    public void gasolineChk(int gasoline) { //주유량 체크 체크완료
        this.gasolineTank += gasoline;
        gasolineMessage();
    }

    @Override
    public void gasolineMessage() { //속도변경에서 필요한 주유량 확인을 위해 메서드 분리.
        System.out.println("현재 주유량: " + gasolineTank);
        if (gasolineTank < 10) {
            status = true;
            statusMode();
            System.out.println("주유가 필요합니다.");
        } else {
            System.out.println("주유량이 10 이상입니다 주행이 가능합니다.");
        }
    }

    @Override
    void speedControl(int speed) {

    }

    public void useTransPort(int passenger) { //승객 탑승 체크완료

        if (!status && passenger < maxPassenger) {  //운행중이면서 현재승객이 최대승객수를 넘지 않으면.
            nowPassenger += passenger;
            maxPassenger -= passenger;
            int totalprice = price * passenger;
            System.out.println(passenger + "명 탑승합니다.");
            System.out.println("요금확인: " + totalprice + "원 입니다.");
            System.out.println("현재 승객 수는 " + nowPassenger + "명 입니다.");
            System.out.println("잔여 좌석 수는 " + maxPassenger + "석 입니다.");

        } else if (passenger > maxPassenger) {
            System.out.println("만석 입니다");
            return;
        } else {
            System.out.println("운행중이 아닙니다.");
        }
    }

    public void speedUp(int speed) {    //속도 변경(가속) 체크완료
        if (gasolineTank < 10) {
            gasolineMessage();
        } else {
            nowSpeed += speed;
            System.out.println("현재 속도: " + nowSpeed);
        }
        if (nowSpeed > 90) {
            System.out.println("과속중입니다 속도를 줄여주세요.");
        }

    }

    public void speedDown(int speed) {    //속도 변경(감속) 체크완료
        if (gasolineTank < 10) {
            gasolineMessage();
        } else {
            nowSpeed -= speed;
            System.out.println("감속합니다.");
            System.out.println("현재 속도: " + nowSpeed);
        }
        if (nowSpeed == 0) {
            System.out.println("정차중입니다.");
        }
    }

}
