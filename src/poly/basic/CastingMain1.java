package poly.basic;

/**
 * casting -> 'cast'의 뜻이 금속 따위를 정형하다라는 뜻을 가진다.
 * casting은 인스턴스내에 같은 공간에 생성된 부모 타입 또는 자식 타입 (또는 손자 타입...)의 타입을 참조값으로 반환하는 연산자이다.
 * casting의 두가지 종류(다운 캐스팅, 업캐스팅)이 있다.
 */
public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        
        // 부모 타입은 자식타입 인스턴스의 참조값이 없으므로 자식타입의 속성과 메서드를 참조할 수 없다.
        // poly.childMethod(); -> 컴파일 에러 발생
        
        // 다운 캐스팅을 통하여 poly의 참조값을 자식타입으로 임시적으로 반환한다.
        Child child = (Child) poly;
        child.childMethod();

        // 이때 poly의 타입과 참조값은 바뀌지 않는다.
        System.out.println(poly);
        System.out.println(child);

        // 임시적 다운 캐스팅을 통하여 변수에 할당하지 않고 바로 메서드 호출 가능하다.
        ((Child) poly).childMethod(); // 연산자의 우선순위 때문에 괄호로 묶어 반환된 참조값에 .(dot)연산 적용
    }
}
