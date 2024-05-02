package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        // 자바는 항상 변수의 값을 복사해서 대입한다.
        // num1에 있는 값 5를 복사해서 num2에 넣는 것이다.
        // num1의 값을 읽어도 num1에 있는 기존 값이 유지되고, 새로운 값이 num2에 들어가기 때문이다.
        // 간단하게 num1에 있는 값을 num2에 대입한다고 표현한다. 하지만, 실제로는 그 값을 복사해서 대입하는 것이다.

        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
