package access.b;

import access.a.Access;

public class AccessOuter {
    public static void main(String[] args) {
        Access ac = new Access();

        // 퍼블릭 호출 가능
        System.out.println("public show");
        System.out.println(ac.publicInt);
        ac.publicMethod();

        // 디폴트 호출 불가능

        // 프라이빗 참조, 호출 불가능
    }
}
