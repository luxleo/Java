package ref;

/**
 * 자바에서 할당은 무조건 값을 복사하여 넣는다
 * 기본형 -> 기본형의 값 복사
 * 참조형 -> 참조형의 참조값(주소값 복사)
 */
public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // b에는 a의 값을 평가하여 넣어준다.

        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
