package chapter14.method;

import chapter8.FinallyTest;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

class MyClass1{

}

class MyClass2{
    int iv;
    MyClass2(int iv){
        this.iv = iv;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Supplier<MyClass1> s = () -> new MyClass1();
        Supplier<MyClass1> s2 = MyClass1::new; //메서드참조로 생성자를 호출함.
        // 클래스이름 :: 메서드이름 - 생성자(메서드임)에 대한 호출은 new키워드를 이용한다.

        Function<String, Integer> f = Integer::parseInt;
        try {
            Integer 염 = f.apply("염");
        }catch (NumberFormatException numberFormatException){
            System.out.println("숫자가 아닌데여?");
        }

        Function<Integer, MyClass2> f3 = (i) -> new MyClass2(i);
        Function<Integer, MyClass2> f2 = MyClass2::new;
        MyClass2 myClass2 = f2.apply(10);
        System.out.println(myClass2.iv);
        System.out.println(f2.apply(20).iv);

        //배열 메서드참조로 생성
        Function<Integer, int[]> intArr = int[]::new;
        int[] realIntArr = intArr.apply(10);
        System.out.println(Arrays.toString(realIntArr));

        Function<Integer, double[]> doubleArr = double[]::new;
        double[] realDoubleArr = doubleArr.apply(10); // 배열크기가 10인 배열이생성
        System.out.println(Arrays.toString(realDoubleArr));


    }
}
