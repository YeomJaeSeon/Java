package second.chapter14.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class Test2 {
    static int defaultValue = -1;
    public static void main(String[] args) {
        // Optional은 null을 직접다루기엔 위험하기에 간접적으로 다루는 방법인 래퍼클래스
        // Optional은 null처리 Optional클래스의 메서드로 간단하게 할수있는 장점이있다.

        //Optional객체 생성

        Optional<Integer> optional = Optional.of(1);
        Optional<Integer> optional1 = Optional.ofNullable(null);

        //Optional 초기화
        Optional<Integer> optional2 = Optional.empty();
        Optional<Integer> optional3 = null;// 부적절 npe 예외 발생하기 쉬움

        //Optional 객체의값 가져오기
        System.out.println(optional.get());
        System.out.println(optional1.orElse(defaultValue));
        //orElse로 Optional에 저장된 값이 null이면 defaultValue를 반환함

        Optional<String> optionalV = Optional.empty();
        optionalV.ifPresent(System.out::println);

        String result = optionalV.orElse("업성");
        System.out.println("result = " + result);

        String s = optionalV.orElseGet(() -> "박지성");
        System.out.println("s = " + s);

        System.out.println("================================");

        String str = "박명수";
        Optional<String> optionalS = Optional.of(str);
        System.out.println("optionalS = " + optionalS);
        String result1 = optionalS.orElse("박명수 친구"); //  박명수가 있으니 박명수가나옴
        System.out.println("result1 = " + result1);

        str = null;
        Optional<String> optional4 = Optional.ofNullable(str);
        System.out.println("optional4 = " + optional4);
        String result2 = optional4.orElse("박명수 친구");
        System.out.println("result2 = " + result2);

        Optional<String> optional5 = Optional.empty();//옵셔널 초기화
        System.out.println("optional5 = " + optional5);
        String result3 = optional5.orElse("박명수 친구의 친구");
        System.out.println("result3 = " + result3);

        optional5.ifPresent(i ->{
            System.out.println(i);
        });

        int randomNum = ((int)(Math.random() * 3)) + 1; // 1 ~ 3
        System.out.println("randomNum = " + randomNum);
        Optional<String> optional6;
        if(randomNum == 1){
            optional6 = Optional.of("일등에 당첨되셨습니다!");
        }else if(randomNum == 2){
            optional6 = Optional.ofNullable(null);
        }else{
            optional6 = Optional.empty();
        }
        System.out.println("optional6 = " + optional6);
        optional6.ifPresent(System.out::println);

        OptionalInt optionalInt = OptionalInt.of(1);
        boolean present = optionalInt.isPresent();
        System.out.println("present = " + present);
        System.out.println(optionalInt.getAsInt());
        OptionalInt optionalInt1 = OptionalInt.empty();
        System.out.println(optionalInt1.isPresent());
        optionalInt1.ifPresent(System.out::println);


    }
}