package chapter4;

import java.util.Scanner;

public class FlowEx9 {
    public static void main(String[] args) {
//        char grade = ' ';
//        System.out.printf("당신의 점수를 입력하세요(1~100) > ");
//
//        Scanner scanner = new Scanner(System.in);
//        int score = scanner.nextInt();
//
//        switch (score){
//            case 100: case 99: case 98: case 97:
//                // .. bad   case  가너뭄낳음.
//        }
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요(1~100) > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score / 10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
                break;
        }
    }
}
