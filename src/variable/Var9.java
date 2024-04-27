package variable;

public class Var9 {
    public static void main(String[] args) {
        // 관례 : 소문자로 시작하는 낙타 표기법
        String orderDetail = "orderDetail";
        String myAccount = "myAccount";

        System.out.println(orderDetail);
        System.out.println(myAccount);

        // 클래스는 대문자로, 나머지는 소문자로 하는것이 관례
        // 클래스 : Person
        // 변수 등 나머지 : firstName, lastName
        // 상수는 모두 대문자를 사용 => USER_LEVEL
        // 패키지는 모두 소문자를 사용
        // 변수 이름은 의미있고, 그 용도를 명확하게 설명해야 한다.
    }
}
