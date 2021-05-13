package chapter14.lambdastart;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
//        Collections.sort(list, new Comparator<String>() { // 익명클래스의 객체생성
//            @Override
//            public int compare(String o1, String o2) {
//                return ((Comparable)o1).compareTo(((Comparable)o2));
//            }
//        });
        Collections.sort(list, (a, b) -> (a.compareTo(b)));


        // 익명 클래스의 객체

        System.out.println(list);

        aMethod(()-> System.out.println(10));

        MYFunction10 f2 = () -> System.out.println("안녀안녕");
        aMethod(f2);
        bMethod().myMethod();
    }
    // 매개변수 함수형인터페이스타입 - 람다식을 넣을수있다.
    //람다식 메서드의 매개변수로 줄수도있다.
    public static void aMethod(MYFunction10 f){
        f.myMethod();
    }
    // 람다식을 메서드 반환할수도
    public static MYFunction10 bMethod(){
        return () -> System.out.println("zz");
    }
}

@FunctionalInterface
interface MYFunction10{
    void myMethod();
}