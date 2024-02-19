package access.a;

public class PublicClass {
    public void callDefault() {
        DefaultClass1 defaultClass1 = new DefaultClass1();
        defaultClass1.innerCall();
    }
}

class DefaultClass1 {
    void innerCall() {
        System.out.println("I am default class");
    }
}
