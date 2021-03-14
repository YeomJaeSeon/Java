package chapter4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;
        System.out.print("숫자를 하나 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if(input == 0){
            System.out.println("입력한 숫자는 0");
        }
        else
            System.out.println("입력한 숫자는 0이아님");
            System.out.printf("입력한 숫자는 %d이다.%n", input);
    }
}
