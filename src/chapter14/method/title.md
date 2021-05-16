# 메서드참조
- 람다식을 더 간단히..!!
- 람다식도 메서드 함수를 하나의 식으로 간단하게 표현한 것인데 더간단히 할수있따??
- 메서드 참조는 클래스이름::메서드이름으로 간단하게 표현가능!
- 바로바로 입력되는 값에대한 정보는 앖의 함수형 인터페이스의 지네릭 타입을 보고 컴파일러가 추론할수 있기 떄문에 가능한것

```java
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

class A {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s);
        // 이 람다식을 메서드참조를 이용하면
        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println(f2.apply("10") + 100);
        //이렇게 메서드 참조를 이용할수있음
        // 왜냐면 함수형인터페이스 Function(java.util.funtion패키지의 인터페이스임)
        //의 지네릭타입을 보고 입력값의타입이 뭔지, 바환값의 타입이 뭔지 컴파일러가 추측할수있기 떄문에 가능한것

        //메서드참조는 생성자를 이용할수도있다. 즉 메서드참조로 객체를 생성할수도있다.

        Supplier<Car> s = () -> new Car();//람다식
        Supplier<Car> s2 = Supplier::new;
        Car car = s2.get();
        System.out.println(car);
        System.out.println(s2.get());
        //찍어보면 다다른 객체가 생성된걸 확인할수있음

        // 생성자 매개변수있는 생성자도 당긍가능!
        //람다식 사용해서 Car2객체 생성하면(생성자는 매개변수 O)
        Function<Integer, Car2> func1 = (i) -> new Car2(i);
        Car2 car2 = func1.apply(1);
        //메서드참조를 이용하면?
        Function<Integer, Car2> func2 = Car2::new;
        //함수형인터페이스의 지네릭타입을보고 유추할수있으므로 생성자를 메서드 참조로 호출가능!

        //배열 생성도 메서드참조가 가능 
        //일단 람다식부터 적용
        Function<Integer, int[]> intArr = (i) -> new int[i];
        int[] realIntArr = intArr.apply(10);
        // 배열길이가 10인 int배열 생성

        //메서드 참조를 이용하면?
        Function<Integer, String[]> strArr = String[]::new; //클래스이름::메서드이름
        String[] realStringArr = strArr.apply(10);
        realStringArr[0] = "염재선";
        System.out.println(Arrays.toString(realStringArr));
        

    }
}

class Car {

}

class Car2 {
    int door;

    Car2(int door) {
        this.door = door;
    }
}
```
- 몇번 실습을 해봤는데 복잡하진않다.
- 메서드참조가 어색하면 반대로 람다식으로 어떻게 변하는지 함수형인터페이스의 지네릭타입을 보고 유추하면 된다!

# 결론
1. 람다식을 더간단하게 사용하려면 메서드 참조를 이용
2. 메서드 참조는 `클래스이름::메서드이름`으로 사용한다.
3. 메서드참조가 가능한것은 함수형인터페이스의 지네릭타입으로 어떤 입력, 어떤 반환값이 올지에 대해 컴파일러가 유추 가능하기 떄문이다.!!