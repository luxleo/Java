package access.b;

import access.a.PublicClass;

public class PublicClassOuter {
    public static void main(String[] args) {
        // public class callable
        PublicClass publicClass = new PublicClass();

        // default class non callable
        //DefaultClass1 defaultClass1 = new DefaultClass1();

        publicClass.callDefault();
    }
}
