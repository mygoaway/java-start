package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 = ");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 시작합니다 = ");
        // 메서드의 반환타입이 void인 경우, 자바가 알아서 마지막에 return; 넣어줌
    }
}
