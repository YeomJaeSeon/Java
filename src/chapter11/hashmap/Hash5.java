package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash5 {
    public static void main(String[] args) {
        String[] stringArr = {"A", "B", "A", "C", "A", "D", "C", "C"};
        HashMap map = new HashMap();

        for(int i = 0; i < stringArr.length; i++){
            if(map.containsKey(stringArr[i])){
                map.put(stringArr[i], (int)map.get(stringArr[i]) + 1);
                // key는 중복안되낟. 덮어씌워짐
            }else{
                map.put(stringArr[i], 1);
            }
        }

        // map의 entry는 이런식으로받아올수있다.
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry next = (Map.Entry) it.next();
            System.out.println("key : " + next.getKey() + ", value: " + printBar((int)next.getValue()) + next.getValue());
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
