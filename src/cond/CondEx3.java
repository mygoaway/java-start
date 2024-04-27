package cond;

public class CondEx3 {
    public static void main(String[] args) {
        int dollar = 10;
        int exchangeRate = 1300;

        if(dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 그맥이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + dollar*exchangeRate + "원입니다.");
        }

    }
}
