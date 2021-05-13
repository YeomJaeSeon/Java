package chapter14.lambdabasic;

import java.util.Scanner;

@FunctionalInterface // 함수형 인터페이스 - 람다식을 위한 인터페이스 (람다식 객체 참조할 참조변수타입)
interface Calculateable{
    int solve(int a, int b);
}

public class CalCulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("숫자 두개를 공백없이 입력하세요(종료  : q)");
            System.out.print(">> ");
            String number = sc.nextLine();
            if(number.equals("q")) break;
            char firstNum = number.charAt(0);
            char secondNum = number.charAt(1);
            if('0' > firstNum || firstNum > '9') {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            System.out.print("연산자를 입력하세요");
            System.out.print(">> ");
            String op = sc.nextLine();
            char operator = op.charAt(0);
            try{
                switch (operator){
                    case '+':
                        Calculateable result = (a, b) -> a + b;
                        int printResult = result.solve(Integer.parseInt(String.valueOf(firstNum)), Integer.parseInt(String.valueOf(secondNum)));
                        System.out.println(printResult);
                        break;
                    case '-':
                        Calculateable result2 = (a, b) -> a - b;
                        int printResult2 = result2.solve(Integer.parseInt(String.valueOf(firstNum)), Integer.parseInt(String.valueOf(secondNum)));
                        System.out.println(printResult2);
                        break;
                    case '*':
                        Calculateable result3 = (a, b) -> a * b;
                        int printResult3 = result3.solve(Integer.parseInt(String.valueOf(firstNum)), Integer.parseInt(String.valueOf(secondNum)));
                        System.out.println(printResult3);
                        break;
                    case '/':
                        Calculateable result4 = (a, b) -> a / b;
                        int printResult4 = result4.solve(Integer.parseInt(String.valueOf(firstNum)), Integer.parseInt(String.valueOf(secondNum)));
                        System.out.println(printResult4);
                        break;
                    default:
                        System.out.println("잘못입력했시라요");
                        continue;
                }
            }catch (ArithmeticException arithmeticException){
                System.out.println("계산 불가능!");
            }



        }
    }
}
