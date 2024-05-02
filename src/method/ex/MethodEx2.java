package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world";
        printMessage(message, 3);
        System.out.println();
        printMessage(message, 5);
        System.out.println();
        printMessage(message, 7);
        System.out.println();
    }


    public static void printMessage(String message, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
