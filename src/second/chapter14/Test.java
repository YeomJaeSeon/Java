package second.chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface MyFunction{
    int max(int a, int b);
}

public class Test {
    public static void main(String[] args) {
        Object obj = new Object(){
            int max(int a, int b){
                return a > b ? a : b;
            }
        };


        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        System.out.println(f.max(10, 20));

        MyFunction f2 = Math::max;


        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        Collections.sort(list, (a, b) -> a.compareTo(b));
    }
}
