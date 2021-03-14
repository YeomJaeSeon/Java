package chapter3;

import java.util.Scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x = %2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);
        System.out.printf("x = %2d, (x %%2 == 0 || x %% 3 == 0) && x %% 6 != 0 = %b%n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);
        System.out.printf("x = %2d, x %%2 == 0 || x %% 3 == 0 && x %% 6 != 0 = %b%n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
        ch = '1';

        System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' =%b%n", ch, '0' <= ch && ch <= '9');

        Scanner scanner = new Scanner(System.in);
        ch = ' ';

        System.out.printf("문자를 하나 입력하세요. >");
        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){
            System.out.printf("입력하신 문자는 숫자입니다 %n");
        }
        if(('a'<= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
            System.out.printf("입력하신 문자는 문자입니다. %n");
        }

    }
}
