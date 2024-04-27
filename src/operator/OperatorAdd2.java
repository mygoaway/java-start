package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 전위 증감 연산자 사용 예
        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b 대입
        System.out.println("a = " + a +  " b = " + b); // a = 2 b = 2

        // 후위 증감 연산자 사용 예
        b = a++; // a의 값을 먼저 b 대입하고, a 증가
        System.out.println("a = " + a +  " b = " + b); // a = 3 b = 2
    }
}
