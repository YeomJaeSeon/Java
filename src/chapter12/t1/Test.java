package chapter12.t1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // 대입연산자간에 타입을 맞추는게 기본 primitive type도 같음
        Integer i = (Integer)list.get(0);
        Object object = (Object) i;
        Integer i2 = (Integer) object;
        
        int a = (int)30.0;
        long b = (long)30.0; // 자동 casting
        double d = 30L; // 자동 casting 크기더 작은 long을 double에 넣을수있음 - 자동 casting

        System.out.println(b + d);
        //double

        
    }
}
