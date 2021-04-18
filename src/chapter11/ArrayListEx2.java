package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length/LIMIT + 10); // 다혀성 이용한것이다.
        // 인터페이스 다형성 이용한것. List인터페이스 구현한 클래스가 ArrayList닌까. List가 ArrayList의 일종의 부모지? 다형성 이용한것.
        for(int i = 0; i < length; i += LIMIT){
            if(i + LIMIT < length){
                list.add(source.substring(i, i + LIMIT));
            }else{
                list.add(source.substring(i));
            }
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)); // get으로 인덱스의 데이터 뽑아옴
        }
    }
}
