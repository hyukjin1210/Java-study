package ex.Report05;

class gugu {
    void gugudan(int dan) {
        if (!(dan >= 2 && dan <= 9)) {
            System.out.println(dan + "단은 없습니다.");
            return;
        }
        System.out.println(dan + "단 시작!");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        System.out.println();
    }

    int gugu(int dan) {
        int result = 0;
        if (!(dan >= 2 && dan <= 9)) {
            System.out.println(dan + "단은 없습니다.");
        }

        System.out.println(dan + "단 시작!");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        return result;
    }

    boolean checkMax(int x, int y) {
        if (x > y) {
            return true;
        } else {
            return false;
            // return 반드시 필요합니다. 만약 없으면 조건문이 false 일 경우, void 가 아닌데 return 문이 없음으로 Error
        }
    }

}

class Method5_2Main {
    public static void main(String[] args) {
        gugu method = new gugu();

//        method.gugudan(2);
//        method.gugudan(5);
//        method.gugudan(10);
//        method.gugudan(9);

        method.gugu(3);

        System.out.println("method.checkMax(10, 8) = " + method.checkMax(10, 8));
        System.out.println("method.checkMax(5, 9) = " + method.checkMax(5, 9));
    }
}