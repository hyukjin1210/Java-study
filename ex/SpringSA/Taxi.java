package ex.SpringSA;

public class Taxi extends transPort{
    private String destination; //목적지
    private int distance;   //기본거리
    private int distanceToDestination;  //목적지 까지의 거리
    private final int distancePrice = 2000;  //거리당 요금
    private int totalPrice;    //누적 금액
    private int maxPassenger = 4;   //탑승가능 승객
    private int status; //상태 (0 = 운행중, 1 = 빈차, 2 = 운행불가)


    public void calculate(String destination, int distanceToDestination) {    //목적지와 목적지까지의 거리
        status = 0;

        this.destination = destination;
        this.distanceToDestination = distanceToDestination;

        System.out.println("목적지: " + destination);
        System.out.println("목적지까지의 거리: " + distanceToDestination + "km");
        int sumPrice = distanceToDestination * distancePrice + price;
        totalPrice += sumPrice;
        System.out.println("지불할 요금: " + sumPrice);
        gasolineTank -= 10;
//        여기에서 조건이 추가되야함
//        주행이 끝나면 maxpassenger 와 nowPassenger 가 초기화 되어야 함.
        super.nowPassenger = 0;
        this.maxPassenger = 4;
    }
    public int total() {    //누적금액 조회
        System.out.println("누적 금액" + totalPrice);
        return totalPrice;
    }

    public Taxi(int number, int price) {
        super(number, price);
    }

    @Override
    public void Info() {    //완료
        System.out.println("택시번호: " + Number + ", 기본요금: " + price);
    }
    public void priceChk() {
        System.out.println("기본 요금 확인 = " + price);
    }

    @Override
    public void gasolineChk(int gasoline) { //완료
        super.gasolineChk(gasoline);
    }

    @Override
    public void gasolineMessage() { //완료
        System.out.println("현재 주유량: " + gasolineTank);
        if (gasolineTank < 10) {
//            status = 2;
            System.out.println("주유가 필요합니다.");
        } else {
            System.out.println("주유량이 10 이상입니다.");
        }
    }

    int statusMode(int status) {   //완료
        switch (status) {
            case 0 : {
                System.out.println("운행중");
            }
            break;

            case 1 : {
                System.out.println("일 반");
            }
            break;
            case 2 : {
                System.out.println("운행 불가");
            }
            break;
        }
        this.status = status;
        return status;
    }

    @Override
    public void speedControl(int speed) {   //완료
        if (gasolineTank > 10) {
            this.nowSpeed += speed;
        } else if (nowSpeed <= 0) {
            System.out.println("정차중 입니다.");
        }
        System.out.println("현재속도: " +nowSpeed);
    }

    @Override
    public void useTransPort(int passenger) {
        if(status == 1 && passenger < maxPassenger) {
            System.out.println("탑승이 가능합니다.");
            nowPassenger += passenger;
            maxPassenger -= passenger;

            System.out.println("현재 승객 수는 " + nowPassenger + "명 입니다.");
            System.out.println("잔여 좌석 수는 " + maxPassenger + "석 입니다.");
        } else if (passenger > maxPassenger) {
            System.out.println("탑승 가능인원 초과 입니다.");
        } else if (status == 0) {
            System.out.println("탑승객이 있습니다.");
        } else {
            System.out.println("운행중이지 않습니다.");
        }

    }


}
/*
궁금한 것.
useTransPort 메서드에서 maxPassenger 와 nowPassenger 를 이용하여 값을 비교 , 연산한다.
그렇다면 초기화를 어떻게 해주어야 맞는 방법인가?
*/