package chapter11.hashmap;

import java.util.*;

public class Hashmap2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("1", 1);
        map.put("2", 2);
        map.put("2", 3);
        map.put("3", 3);
        map.put("4", 3);

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry next = (Map.Entry) it.next();
            System.out.println(next.getKey() +", " + next.getValue());

        }
        Iterator it2 = map.entrySet().iterator();
        while(it2.hasNext()){
            Map.Entry next = (Map.Entry) it2.next();
            System.out.println(next.getKey() + ", " + next.getValue());
        }

        System.out.println("map = " + map);

        System.out.println(map.containsValue(3));
        System.out.println("map.containsKey(\"3\") = " + map.containsKey("3"));
        System.out.println("map.get(\"1\") = " + map.get("1"));
        Iterator it3 = map.entrySet().iterator();
        while(it3.hasNext()){
            Map.Entry next = (Map.Entry) it3.next();
            System.out.println("next.getKey() + \", \" + next.getValue() = " + next.getKey() + ", " + next.getValue());
        }

        Iterator it4 = map.keySet().iterator();
        while(it4.hasNext()){
            System.out.println("itr4.ne = " + it4.next());
        }

        Collection values = map.values();
        Iterator it5 = values.iterator();
//        Iterator it5 = map.values().iterator();
        while(it5.hasNext()){
            System.out.println("it5 = " + it5.next());
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        System.out.println("map2 = " + map2);

        System.out.println(map2.remove("2"));
        System.out.println("map2 = " + map2);

        map2.replace("1", "100");
        System.out.println("map2 = " + map2);

        Iterator it7 = map2.entrySet().iterator();
        while(it7.hasNext()){
            Map.Entry next = (Map.Entry) it7.next();
            System.out.println("next.getKey() + \", \" + next.getValue() = " + next.getKey() + ", " + next.getValue());
        }

    }
}
