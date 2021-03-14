package chapter4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        score = Integer.parseInt(input);

        if(score >= 90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >= 70){
            grade = 'C';
        }else{
            grade = 'F';
        }
        System.out.printf("당신의 학점은 %c 입니다. %n", grade);
    }
}
