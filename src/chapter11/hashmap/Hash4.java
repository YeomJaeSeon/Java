package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash4 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "D", "Z", "D", "A"};

        HashMap map = new HashMap();

        for(int i = 0; i < data.length; i++){
            if(!map.containsKey(data[i])){
                map.put(data[i], 1);
            }else{
                map.put(data[i], (Integer)map.get(data[i]) + 1);
            }
        }

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry next = (Map.Entry) it.next();
            System.out.println("key : " + next.getKey() + ", value : " + printBar((int)next.getValue()) +next.getValue());
        }
    }
    static String printBar(int count){
        String s = "";
        for(int i = 0; i < count; i++){
            s += "#";
        }
        return s;
    }
}

