package SpringSA;

abstract class transPort {
    protected final int Number;
    protected int gasolineTank = 100;
    protected int nowSpeed;
    protected int price;
    protected int nowPassenger;
//    private int maxPassenger;   //여기에 사용할 수 있는 방법?
    public transPort(int number, int price) {  //교통 생성자.
        this.Number = number;
        this.price = price;
    }

    public void Info() {
        System.out.println("차량번호: " + Number + ", 기본요금: " + price);
    }

    public void gasolineChk(int gasoline) { //주유량 체크 체크완료
        this.gasolineTank += gasoline;
        gasolineMessage();
    }

    public void gasolineMessage() { //속도변경에서 필요한 주유량 확인을 위해 메서드 분리.
        System.out.println("현재 주유량: " + gasolineTank);
        if (gasolineTank < 10) {

            System.out.println("주유가 필요합니다.");
        } else {
            System.out.println("주유량이 10 이상입니다 주행이 가능합니다.");
        }
    }

//    abstract void statusMode(); //운행상태를 결정할 추상메서드

    abstract void speedControl (int speed);

    abstract void useTransPort(int passenger);
}
