package loop;

public class Nested1 {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++) {
            System.out.println("외부 for i 시작:" + i);
            for(int j = 0; j < 3; j++) {
                System.out.println("내부 for i :" + i +"-" + j);
            }
            System.out.println("외부 for 종료");
            System.out.println();
        }
    }
}
