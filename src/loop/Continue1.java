package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // while(true) => 무한 반복
        while(i < 6) {
            if(i == 3) {
                i++;
                continue;
            }
            System.out.println("현재 숫자는 : i = " + i);
            i++;
        }
    }
}
