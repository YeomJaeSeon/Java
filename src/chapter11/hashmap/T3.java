package chapter11.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class T3 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("김자바", 80);
        map.put("김자바", 100); // 덮어씌워짐 key는 중복 허용 X
        map.put("염자바", 99);
        map.put("강자바", 98);
        map.put("황자바", 80);

        Collection values = map.values();
        Iterator it = values.iterator();
        int sum = 0;
        while(it.hasNext()){
            sum += (Integer) it.next();
        }
        System.out.println("sum = " + sum);
        double avg = sum / (double)map.size();
        System.out.println("avg = " + avg);
    }
}
