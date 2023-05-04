package ex.Report08;

/*
7-2. 연습문제 7-1. 의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.

메서드명 : shuffle
기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
반환타입 : 없음
매개변수 : 없음

메서드명 : pick
기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
반환타입 : SutdaCard
매개변수 : int index - 위치

메서드명 : pick
기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
반환타입 : SutdaCard
매개변수 : 없음
*/

class SutdaDeck1 {
    final int CARD_NUM = 20;
    SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

    SutdaDeck1() {
        // 연습문제 7-1 의 답이므로 내용생략
        for (int i = 0; i < CARD_NUM / 2; i++) {    //0 ~ 9까지
            cards[i] = new SutdaCard1(i + 1, false);
            if (i == 0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard1(i + 1, true);
            }

        }

        for (int i = 10; i < CARD_NUM; i++) {   //10 ~ 20까지
            cards[i] = new SutdaCard1(i % 10 + 1, false);
        }
    }

    void shuffle() {
        // (구현)
//        for (int i = 0; i < CARD_NUM; i++) {
//            for (int j = 0; j < CARD_NUM; j++) {
//                SutdaCard1 tmp = cards[i];
//                cards[i] = cards[j];
//                cards[j] = tmp;
//            }
//        }
        for (int i = 0; i < CARD_NUM; i++) {
            int x = (int)(Math.random()* CARD_NUM);
            int y = (int)(Math.random()* CARD_NUM);
            SutdaCard1 tmp = cards[x];
            cards[x] = cards[y];
            cards[y] = tmp;
        }
    }

    SutdaCard1 pick(int index) {
        // (구현)

        return cards[index];
    }

    SutdaCard1 pick() {
        // (구현)
        int i = (int) ((Math.random() * CARD_NUM) + 1);
        return cards[i];
    }
} // SutdaDeck

class SutdaCard1 {
    int num;
    boolean isKwang;

    SutdaCard1() {
        this(1, true);
    }

    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck1 deck = new SutdaDeck1();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2