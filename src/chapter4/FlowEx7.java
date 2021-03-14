package chapter4;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");
        Scanner scanner = new Scanner(System.in);

        int user = scanner.nextInt();
        int com = (int)(Math.random() * 3) + 1; // 1, 2, 3

        System.out.printf("당신은 %d 입니다.%n", user);
        System.out.printf("컴퓨터는 %d 입니다.%n", com);

        switch (user - com){
            case 1: case -2:
                System.out.println("you win");
                break;
            case 2: case -1:
                System.out.println("you lose");
                break;
            default:
                System.out.println("비김 ㅋㅋ");
                break;
        }
    }
}
