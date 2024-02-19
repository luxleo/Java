package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(int a) {
        super(a);
        System.out.println("ClassC.ClassC");
    }

    public ClassC(int a, int b) {
        super(a, b);
        System.out.println("ClassC.ClassC");
    }
}
