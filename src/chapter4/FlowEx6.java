package chapter4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("계절은 봄");
                break;
            case 6: case 7: case 8:
                System.out.println("계절은 여름");
                break;
            case 9: case 10: case 11:
                System.out.println("계쩔은 가을");
                break;
            default:
                System.out.println("게절은 겨울");
        }
    }
}
