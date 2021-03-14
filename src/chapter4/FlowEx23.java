package chapter4;

import java.util.Scanner;

public class FlowEx23 {
    public static void main(String[] args) {
        int input = 0;
        int answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("1과 100사이 정수 입력하시오. >");
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("더 작은수로 시도해보세요");
            }else if(input < answer) {
                System.out.println("더 큰수로 시도해보세요.");
            }
        }while (input != answer); // do while에서 while끝 ; 잊지말자
        System.out.println("정답!");
    }
}
