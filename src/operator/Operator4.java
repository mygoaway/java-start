package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 연산자 우선순위가 애매하면 괄호를 명시적으로 사용하자
        int sum3 = 2 * 2 + 3 * 3; // (2*2) + (3*3)과 동일하다. 복잡한 경우, 괄호를 명시적으로 사용하는것이 좋다.
        int sum4 = (2*2) + (3*3);

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
