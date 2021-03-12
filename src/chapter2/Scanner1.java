package chapter2;

import java.util.*;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
//        nextLine은 String을 리턴하는구만!
        System.out.printf("input값 : %s %n", input);
        int inputToNum = Integer.parseInt(input);
        System.out.printf("int로 변경한 input : %d %n", inputToNum);

        int firstInputNumber = scanner.nextInt();
        System.out.printf("바로 숫자로입력받음 : %d %n", firstInputNumber);

        float firstFloatNumber = scanner.nextFloat();
        System.out.printf("바로 float실수로 입력받음 : %g %n", firstFloatNumber);

//        nextInt()나 nextFloat()같은 메서드들은 화면에서 연속적으로 입력받아서 사용하기 까다롭다. 차라리 nextLine()메서드를 이용하고
//        Interget.parseInt()라던가 Float.parseFloat()이라던가 메소드를 이용해서 문자열로 입력받으 년석을 변환하는것이 더 낫다.
    }
}
