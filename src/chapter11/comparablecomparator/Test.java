package chapter11.comparablecomparator;

import java.util.Arrays;
import java.util.Comparator;

// Comparable, Comparator - 정렬할때 기준을 제공하는 인터페이스 Comparable- compareTo, Comparator - compare 추상메서드가졵해ㅏㅁ
// Comparable은 이미 존재하는 기준을사용
// Comparator는 내가 정려랗는 기준을 만들때 compare(Object o, Object o1)메서드를 오버라이딩하면됨
public class Test {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); // 대상만있음 기준이없음 기준으노 Comparable이넡페이스의 compareTo로 하겠다는거임
        // 실제로 String클래스는 Comparable인터페이스가 구현되어있음 이말은 compareTo 메서드가 오버라이딩되어있음. 자신에맞게
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자구분없이 정렬하겠다. 기준을 내가 준거임. compareto메서드르 ㄹ사용하지않겠따.
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("Arrays.toString(straA) = " + Arrays.toString(strArr));
    }
}
class Descending implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable o11 = (Comparable) o1;
            Comparable o21 = (Comparable) o2;

            return o11.compareTo(o21) * -1;
        }
        return -1;
    }
}
