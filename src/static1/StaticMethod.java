package static1;

public class StaticMethod {
    private static int staticVar;
    private int instanceVar;

    /**
     * 인스턴스 참조값을 전달 받을 수 없는 정적 함수는
     * 인스턴스 멤버 변수, 인스턴스 메서드를 참조하거나 호출할 수 없다.
     */
    public static void staticCall() {
        staticVar++;
        /* 정적 함수(static method)는 static 변수와 메서드만 호출 가능하다.
        instanceVar++;
        instanceCall();
         */
    }

    /**
     * 이와 같이 인스턴스 참조값을 전달 받아 호출할 수 있는 방법이 있긴하다.
     * @param instance
     */
    public static void staticInstance(StaticMethod instance) {
        instance.instanceCall();
    }

    public void instanceCall() {
        staticVar++;
        instanceVar++;
        staticCall();
    }
}
