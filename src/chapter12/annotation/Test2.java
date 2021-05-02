package chapter12.annotation;

class Car{
    void parentMethod(){

    }
}
class SportCar extends Car{
    @Override // 컴파일러에게 오버라이딩한 메서드라고알려줌
    //컴파일러가혹시모를 오류를 잡는게가능.
    @Deprecated
    void parentMethod(){
    }

}

@FunctionalInterface // 함수형인터페이스라고 컴파일러에게 알려줘.. @Override와 같음 . 이러면 컴파일러가 확인함.
    // 함수형 인터페이스는 추상메서드 하나만이썽야하.ㅁ 둘이상 X
interface FuncInter{
    void func();
}

public class Test2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        sportCar.parentMethod(); // Deprecated
    }
}
