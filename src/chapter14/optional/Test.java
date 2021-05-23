package chapter14.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
//        int[] arr = null; // 이렇게하지말자 초기화를- NPE터짐
        int[] arr = new int[0]; // 이렇게 초기화하도록! - Optional도 이러한 메카니즘
        System.out.println("arr.length=" + arr.length);

//        Optional<String> opt = null;/\ 바람직 X
        Optional<String> opt = Optional.empty(); // 바람직함!
        System.out.println("opt = " + opt);
//        System.out.println("opt.get() = " + opt.get());
        String str = "";
//        try{
//            str = opt.get();
//        }catch (NoSuchElementException e){
//            str= "";
//        }
        str = opt.orElse("ㅋ");
        System.out.println("str="+str);

        Object[] objArr = null; // 바람직하지않음 objArr을 사용할때 npe터질 가능성이 존재
        Object[] objArr2 = new Object[0]; // 바람직 - npe터질가능성이 존재하지않음

        String s = null; // 바람직 X
        String goodS = ""; // 바람직 O

        // null로 초기화할땐 문제없음 그러나 아무것도 가르키지않는, null을가르키는
        // 참조변수를 사용할때 NPE가 터질확률이 너무 큼

        // Optional객체도 null로 초기화할땐
        Optional<String> optional = null; //가능! 그러나 바람직하지않음
//        optional.get(); - NPE
        Optional<String> optional1 = Optional.empty(); // 이걸사용.. Optional객체가 존재하긴하는데 Optional객체는 null을 가르킴
        // 그래서 이때
        String str1 = "";
        try{
            str1 = optional1.get();
        }catch (NoSuchElementException ne){
            str1 = "null인데예?";
        }
        System.out.println("str1 = " + str1);

        String str2 = optional1.orElse("optional객체가 null가르킬때 예외처리안하고 쉽게사용하는법");
        System.out.println("str2 = " + str2);

        Optional<String> optional2 = Optional.empty();
        String s1 = optional2.orElse("null");
        System.out.println("s1 = " + s1);

//        String s2 = optional2.orElseGet(() -> new String());
        String s2 = optional2.orElseGet(String::new); // 생성자 매개변수없으면 String은 내부 value를 "" 값을 저장하는 주소를 참조..
        System.out.println("s2 = " + s2.getClass());

        String s3 = null;
        Optional<String> optional3 = Optional.ofNullable(s3);
        System.out.println("optional3 = " + optional3);

    }
}
