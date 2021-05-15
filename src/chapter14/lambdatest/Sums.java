package chapter14.lambdatest;

import java.util.function.Function;
import java.util.function.Predicate;

public class Sums {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);

        Function<String, String> h = f.andThen(g); // f o g
        Function<Integer, Integer> h2 = g.andThen(f); // g o f
        // Function함수형인터페이스는 매개변수 o 반환값 o인 람다식 참조변수 타입

        System.out.println(h.apply("FF"));
        System.out.println(h2.apply(2));
        // Function의 합성
        // andThen만 알면됨 compose몰라도됨

        Function<String, String> f2 = x -> x;//항등함수
        System.out.println(f2.apply("aaa"));
        //입력받은거 그대로주는것.

        Predicate<Integer> p = i -> i < 100; // 매개변수 o, 반환값 : boolean - 입력되는 매개변수는 Integer
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100 (! p)

        Predicate<Integer> all = notP.and(q.or(r)); // i >= 100 && (i < 200 || i % 2 == 0)
        System.out.println(all.test(150));
        System.out.println(all.test(249));
        // Predicate의 결합이다.
        // 순서도있음 - 순서에 주의
        Predicate<Integer> all2 = notP.and(q).or(r); // !(i < 100) && i < 200 || i % 2 == 0

        String str1=  new String("abc");
        String str2 = new String("abc");
        Predicate<String> p2 = Predicate.isEqual(str1); // == 안쓰고 equals 메서드를 사용한다. new String해도 같다.
        // new STring("~") new STring("~")햇으면 새로운 객체 주소를 참조하고있으므로 ==했ㅇ면
        // false가 나와야한다.

        boolean result = p2.test(str2);

//        Predicate<String> p2 = Predicate.isEqual(str1).test(str2); - 한줄로 표현현
       System.out.println("같음? : " + result);

    }
}
