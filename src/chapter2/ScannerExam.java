package chapter2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("두자리 정수를 하나 입력해주세요 >");
        String input = scanner.nextLine();
        int inputToInteger = Integer.parseInt(input);

        System.out.println("입력내용 : "+ input);
        System.out.printf("inputToInteger : %d%n", inputToInteger);

        String num = scanner.nextLine();
        int comverToInt = Integer.parseInt(num);
//        nextLine()메서드는 반환하는 값이 String이당.. nextInt나 nextFloat이런 녀석들이 있지만
//        그냥 nextLine()으로 strinㅎ으로 연속으로 입력받고 변환해주자. (Integer.parseInt())라던가 Float.parseFloat()같은 녀석들로.)

        System.out.printf("%d%n", comverToInt);
    }
}
