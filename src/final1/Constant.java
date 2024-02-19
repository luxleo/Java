package final1;

/**
 * 인스턴스마다 중복 필요한 필드가 아닌 공동 데이터인 경우 static으로 관리한다.
 * final 키워드를 이용하여 상수를 중앙집중적으로 관리할 수 있다.
 * 이로써 확장성을 만족할 수 있다.
 */
public class Constant {
    //final의 경우 값의 재할당이 불가능하므로 public 으로 공개해두어도 좋다.
    public static final double PI = 3.14;
    public static final int MAX_COUNT = 1000;

}
