package second.chapter5.overloading;

import java.util.Arrays;

class MyMath3{
    int add(int a, int b){
        System.out.println("int MyMath3.add");
        return a + b;
    }
    long add(long a, long b){
        System.out.println("long MyMath3.add");
        return a + b;
    }
    int add(int[] arr){
        System.out.println("arr MyMath3.add");
        return Arrays.stream(arr).sum();
    }

}
public class Test {
    public static void main(String[] args) {
        MyMath3 myMath3 = new MyMath3();
        System.out.println(myMath3.add(new int[]{1, 2, 3, 4, 5}));
        System.out.println(myMath3.add(1, 3));
        System.out.println(myMath3.add(100L, 200L));

    }
}
