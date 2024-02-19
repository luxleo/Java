package ref;

/**
 * 대원칙인 '자바에서 값 할당은 무조건 복사'에 따라
 * 함수 실행 스택인 지역변수에서 선언된 매개변수도
 * 값을 할당 받을때
 * 참조형 -> 참조형의 주소지 복사
 * 원시형 -> 원시형의 값 복사
 * 하여 할당한다.
 */
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("변경전 : " + a);
        // 영향을 미치지 않는다.
        changePrimitiveValue(a);
        System.out.println("after : " + a);

        Data data = new Data();
        System.out.println("변경전 : " + data.value);
        //영향을 미친다.
        changeRefValue(data);
        System.out.println("after : " + data.value);
    }

    static void changePrimitiveValue(int x) {
        x = 10;
    }

    static void changeRefValue(Data dataX) {
        dataX.value = 20;
    }
}
