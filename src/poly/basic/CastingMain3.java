package poly.basic;

/**
 * 다운캐스팅은 위험하다.
 * 업캐스팅은 안전하다.
 */
public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        // parent는 Child 인스턴스 없이 홀로 생성되어 있는 Parent인스턴스를 참조한다.
        Child child = (Child) parent; // java.lang.ClassCastException -> 생성되어 있지 않은 Child를 참조 하려함

        /*
        업캐스팅은 항상 상속받은 부모 인스턴스와 같이 생성된 자식 인스턴스 내에서 부모 타입으로 참조값을 타입 변환하므로 안전하다.

        다운 캐스팅은 상속된 자식클래스가 아닌 순수한 부모 클래스로 생성된 인스턴스에서 자식 타입인스턴스를 참조 하려하므로
        runtime 익셉션이 발생할 수있다.
         */
    }
}
