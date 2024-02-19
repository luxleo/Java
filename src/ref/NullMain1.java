package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println("data = " + data);

        // null이 되어 생성된 인스턴스를 어떤 변수도 참조하고 있지 않다면
        // GC에 의하여 메모리할당이 해제된다.
        data = null;
        System.out.println("data = " + data);

    }
}
