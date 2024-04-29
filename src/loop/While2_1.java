package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

        int startNum = 1;
        int endNum = 3;
        while (startNum <= endNum) {
            sum += startNum;
            System.out.println("i = " + startNum + " sum = " + sum);

            startNum++;
        }
    }
}
