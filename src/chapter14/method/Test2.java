package chapter14.method;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;


class MyClass{
    int iv;
    MyClass(int iv){
        this.iv = iv;
    }

    @Override
    public String toString() {
        return iv+"";
    }
}
public class Test2 {
    public static void main(String[] args) {
//        Supplier<MyClass> s = () -> new MyClass();
//        System.out.println(s.get()); // 객체를 반환
//
//        <MyClass> s2 = MyClass::new; // 메서드참조변수(객체생성)
//        MyClass myClass = s2.get();
//        System.out.println(myClass);
//        System.out.println(s2.get());

        // Integer를 입력, MyClass 타입의 참조변수 반환환
        Function<Integer, MyClass> f3 = (i) -> new MyClass(i);
        Function<Integer, MyClass> f = MyClass::new;
        MyClass myClass = f.apply(1);
        System.out.println(myClass);
        System.out.println(f.apply(2));

        //배열 - 배열생성할땐 꼭 함수형인터페이스타입을 Function으로 줘야함.
        Function<Integer, int[]> arr = i -> new int[i];
        Function<Integer, char[]> charArr = char[]::new;
        int[] realArr = arr.apply(100);
        System.out.println(Arrays.toString(realArr));
        char[] realCharArr = charArr.apply(100);
        System.out.println(Arrays.toString(realCharArr));


    }
}
