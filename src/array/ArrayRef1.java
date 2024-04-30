package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int [] students; // 배열 선언
        students = new int[5]; // 배열 생성(초기화), student 변수에 int 타입을 담을 수 있는 배열의 주소값(참조값)을 저장

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}
