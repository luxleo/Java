package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1;
        // 슈퍼클래스와 같은 패키지인 경우에만 접근 가능하므로 컴파일 에러 발생
        //defaultValue = 1;
        // privateValue = 1;

        publicMethod();
        protectedMethod();
        // 슈퍼클래스와 같은 패키지가 아니므로 접근 불가능
        //defaultMethod();
        //privateMethod();
    }
}
