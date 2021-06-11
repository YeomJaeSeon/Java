package second.chapter5.overloading;

import java.util.Arrays;

public class Variable {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};
        System.out.println(concentrate("-", strArr));
        System.out.println(concentrate(" ", new String[]{"h", "e", "ll"}));
        System.out.println(concentrate(",", "100", "200", "300")); //가변인자

        Variable variable = new Variable();
        variable.print();

        int result = variable.addManyThings(10, 20, 30, 40, 50, 60);
        System.out.println("result = " + result);
        int result2 = variable.addManyThings(new int[]{1, 2, 3, 4, 5});
        System.out.println("re = " + result2);


    }
    static String concentrate(String delim, String... args){
        String result = "";
        for (String arg : args) {
            result +=  (arg + delim);
        }
        return  result;
    }
    void print(){
        System.out.println("Variable.print");
        subprint();
    }
    void subprint(){
        System.out.println("subPrint");
    }
    int addManyThings(int... integerArgs){
        return Arrays.stream(integerArgs).sum();
    }

    void print(int a){
        System.out.println("a = " + a);
    }
    void print(long a){
        System.out.println("a = " + a);
    }
}