package second.chapter7.trycatch1;

import chapter14.sorted.Ex;

public class Test2 {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1() throws Exception{
        try{
            method2();
        }catch (Exception e){

        }
    }
    static void method2() throws Exception{
        throw new Exception();
    }
}
