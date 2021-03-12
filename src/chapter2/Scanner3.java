package chapter2;

import java.util.*;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        System.out.println(inputString);
        int number = Integer.parseInt(inputString);
        System.out.printf("입력받은값(int형임) : %d %n", number);

//        애초에 int로 입력받기 nextLine()메서드말고 nextInt()로
        int number2 = scanner.nextInt();
        System.out.printf("입력받은값2(10진수로) : %d %n", number2);

        float floatNum = scanner.nextFloat();
        System.out.printf("입력받은실수 : %f %n", floatNum);

//        nextLine()메서드를 이용한다음 변환하자 Integer.parseInt라던가 Float.parseFloaT()메소드를 이용해서..
    }
}
