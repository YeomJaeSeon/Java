package chapter11.hashmap;

import java.util.*;

public class Hash3 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        System.out.println("set = " + set);
        Iterator it = set.iterator();

        while(it.hasNext()){
            // Entry는 Map인터페이스의 내부 인터페이스임. Map인터페이스 내부의 또다른 인터페이스
            Map.Entry next = (Map.Entry) it.next();
            System.out.println("이름 : " + next.getKey() + ", 점수 : " + next.getValue());
        }
        // entrySet으로 map의 key value읽는법

        Set set1 = map.keySet();
        System.out.println("set1 = " + set1);
        // key만읽는법

        Collection values = map.values();
        Iterator it2 = values.iterator();

        int total = 0;
        while(it2.hasNext()){
            int i = (int)it2.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (double)total/map.size());
        System.out.println("최고 : " + Collections.max(values));
        System.out.println("최저 : " + Collections.min(values));

    }
}
