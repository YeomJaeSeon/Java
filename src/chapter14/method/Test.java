package chapter14.method;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 메서드참조 : 람다식을 더간단하게 한것
 * 클래스이름::메서드이름
 * 어떻게이게가능?
 * 함수형인터페이스 지네릭 타입에 정보가 다있으므로 가능함.
 * Function<String, Integer> f = (s) -> Integer.parseInt(s);
 * 의 람다식을
 * Function<String, Integer> f = Integer::parseInt; 로 변경가능.
 * 이건 진짜 생소하긴하네
 * 메서드참조를 람다식으로 다시변경하는 연습을하자.
 * 함수형인터페이스 지네릭타이의 정보를 이용하는것을생각!
 */

@FunctionalInterface
interface MyFunction<T, R>{
    T apply(R str);
}
public class Test {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s);
        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println("\"5\"-> 5 : " + f2.apply("5"));
        System.out.println(f2.apply("5") + 100);

//        MyFunction<String, Integer> myFunction = s -> Integer.parseInt(s);
        //당연히됨
        MyFunction<Integer, String> myFunction2 = Integer::parseInt;
        System.out.println(myFunction2.apply("5") + 200);
        // 내가만든 함수형인터페이스에대해서도 메서드참조가 가능하군.

//        Supplier<Car> s = () -> new Car(); // Supplier인터페이스는 리턴만함 입력 매개변수는없음
        // 아낌없의 주는나무
//        Supplier<Car> s2 = Car::new; // 메서드참조를통해 객체생성성
        // 메서드이름대신 new 키워드를 사용함
        // 람다식보다 메서드참조가 더 간결하긴함. 함수형인터페이스에 지네릭 타입의 정보가 있기에 가능한것이다.

        Function<Integer, Car> f5 = Car::new;

        Function<Integer, int[]> arr = x -> new int[x];
        //입력 Integer, 반환 int[] 타입 참조변수
        Function<Integer, int[]> arr2 = int[]::new; // 이거많이씀
        int[] apply = arr2.apply(10);
        apply[1] = 100;
        System.out.println(Arrays.toString(apply));

    }
}

class Car{
    private int door;
    public Car(int door) {
        this.door = door;
    }
}
