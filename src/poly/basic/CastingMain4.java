package poly.basic;

/**
 * 다운캐스팅은 위험하다. -> instanceof 연산을 통하여 안전한 다운 캐스팅을하자.
 */
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent poly = new Child();

        call(parent);
        callPattern(poly);
    }

    public static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스가 맞는지 확인
        if (parent instanceof Child) {
            ((Child) parent).childMethod();
        }
    }

    /**
     * java 16부터 pattern mathching for instanceof를 지원하여
     * 인스턴스타입을 체크하고 맞는 경우 바로 변수를 할당할 수있다.
     * @param parent
     */
    public static void callPattern(Parent parent) {
        parent.parentMethod();
        // check Child instance
        if (parent instanceof Child child) {
            child.childMethod();
        }
    }
}
