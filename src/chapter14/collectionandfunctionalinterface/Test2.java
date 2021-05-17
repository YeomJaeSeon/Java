package chapter14.collectionandfunctionalinterface;


import java.util.function.Function;
import java.util.function.Supplier;

//메서드참조 : 클래스이름 ::메서드이름
// 메서드참조 : 람다식을 더~~~간단하게
public class Test2 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s);
        int a = f.apply("1");
        System.out.println(a);

        Function<String, Integer> f2 = Integer::parseInt; // 함수형인터페이스의 지네릭타입을보고 유추할수있따.
        System.out.println(f2.apply("2"));

        Supplier<MyClass> s = () -> new MyClass();
        MyClass myClass = s.get();
        System.out.println(myClass);
        System.out.println(s.get());

        Supplier<MyClass> s2 = MyClass::new;
        System.out.println(s2.get());


        Function<Integer, MyClass2> f3 = (i) -> new MyClass2(i);
        System.out.println(f3.apply(10).iv);
        Function<Integer, MyClass2> f4 = MyClass2::new; // 입력과 반환이 뭔지 함수형인터페이스와 지네릭타입을보고 알수있음

        // 배열 메서드참조로 만들기
        Function<Integer, int[]> f5 = (i) -> new int[i];
        int[] intArr = f5.apply(5);
        System.out.println(intArr.length);

        //메서드참조로! 람다식보다 간단하게
        Function<Integer, int[]> f6 = int[]::new;
        //(입력 - 정수, 반환 - int[]) - Function함수형인터페이스 : 매개변수와 반환이있음
        System.out.println(f6.apply(10).length);
        //길이 요러케 반환!



    }
}
class MyClass2{
    int iv;
    public MyClass2(int iv){
        this.iv = iv;
    }
}
class MyClass{

}
