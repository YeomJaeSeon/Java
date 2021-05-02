package chapter12.annotation;

import java.util.ArrayList;
import java.util.Date;

class Parent{
    void parentMethod(){
        System.out.println("난 부모");
    }
}
class Child extends Parent{
    @Override
    @Deprecated
    void parentMethod(){
        System.out.println("난 자식");
    }
}

//아직 안배웠는데 함수형 인터페이스는 하나의 추상메서드만 가능.
@FunctionalInterface // 함수형 인터페이스를 잘 선언했는지 컴파일러가 체크해줌.
interface Testable{
    void test(); // 추상메서드
//    void check();
}

public class AnnotationTest extends Parent {

    // 내가 확인햇엉.!
//    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();
    }
}
