package access.a;

public class AccessInner {
    public static void main(String[] args) {
        Access ac = new Access();

        // 퍼블릭 호출 가능
        System.out.println("public show");
        System.out.println(ac.publicInt);
        ac.publicMethod();

        // 디폴트 호출 가능
        System.out.println("default show");
        System.out.println(ac.defaultInt);
        ac.defaultMethod();

        // 프라이빗 참조, 호출 불가능

    }
}
