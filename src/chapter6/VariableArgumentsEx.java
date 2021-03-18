package chapter6;

import java.util.Arrays;

public class VariableArgumentsEx {
    public static void main(String[] args) {
        System.out.println(concentration("-", "100", "200", "300", "400"));
        String[] strArr = {"010", "1234", "5678"};

        System.out.println(concentration("-", strArr));
        System.out.println(Arrays.toString(strArr));
        System.out.println(concentration("-", new String[]{"zz", "ss", "ee"}));

        concentration("1", "2, ", "3");
        

    }
    // 타입 ...args : 가변 인자 - 매개변수의 개수가 달라질수있음. 오버로딩 처럼 메서드 여러번 선언안해도 되니 좀편하네 
    // 사실 가변인자는 내부적으로 배열을 이용함 , 그닌까 배열을 가르키는 주소를 전달하는 매커뉘즘이다.
    static String concentration(String delim, String ...args){
        String result = "";
        // 배열일 이용하므로 이러한 문법이가능.
        args[0] = "101";
        for(String value : args){
            result += (value + delim);
        }
        return result;
    }

    // 가변인자를 매개변수로받는 메서드는 오버로딩 하지않는게좋음. 하지말자 그냥 위의 메소드와 오버로딩이되지아늫ㅇㅁ. 매개변수로 구분이안되므로 에러가됨.
//    static String concentration(String ...args){
//        System.out.println(args[0]);
//    }
}
