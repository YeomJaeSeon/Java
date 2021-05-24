package chapter14.allre;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * 1. NPE의 위험성- null 간접적으로 다룸 - null safe
 * 2. null check의 귀찮음 - 깔끔하게 널체크
 * - 하나의 데이터소스밖에 , 하나의 요소밖에없는 스트림이라 생각하면서 사용하여 깔끔하게 널체크를할수있음. 스트림과같이 람다식을 이용한 메서드 사용가능
 */
public class OptionalTest {
    static String string;
    public static void main(String[] args) {
        String s=  null; //X 바람직 X
        String s2 = ""; //바람직
        Object[] objArr = null; // 바람직 X
        Object[] objects = new Object[0]; //바람직

        //옵셔널 객체 생성
        Optional<String> optional = Optional.of("염재선");

        System.out.println(optional.get());

        String s10 = null;
        Optional<String> optional1 = Optional.ofNullable(null);

        System.out.println(optional1.orElse("EMPTY잖아!!"));

        Optional<String> optional2 = null; //바람직 X
        Optional<String> optional3 = Optional.empty(); //바람직 O

//        System.out.println(optional2.orElse("EMPTY"));
        String empty_ㅜㅠ = optional3.orElse("EMPTY ㅜㅠ");
        System.out.println(empty_ㅜㅠ);

        String s1 = optional3.orElseGet(() -> "EMPTY인데영?");
        System.out.println("s1 = " + s1);

        OptionalInt optionalInt = OptionalInt.of(100);
        int asInt = optionalInt.getAsInt();
        System.out.println("asInt = " + asInt);

        OptionalInt optionalInt1 = OptionalInt.empty();
        System.out.println(optionalInt1.isPresent());



        String string = null;
        int randomNumber = (int)(Math.random() * 10) + 1;
        if(randomNumber % 2 == 0){
            string = "쭈쭈루쭈쭈쭈 키싱유 베이베~";
        }

        Optional.ofNullable(string).ifPresent(System.out::println);


    }
}
