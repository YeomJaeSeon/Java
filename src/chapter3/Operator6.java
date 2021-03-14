package chapter3;

import java.util.Scanner;

public class Operator6 {
    public static void main(String[] args) {
        int x = 15;
        System.out.printf("%b%n", x > 10 && x < 20);

        System.out.printf("%b%n", 10 < x && x < 20);

        int i = 6;
        System.out.printf("%b%n", i % 2 == 0 || i % 3 == 0);

        System.out.printf("%b%n", i % 2 == 0 || i % 3 == 0 && i % 6 != 0);
        // 보시면 &&가 || 즉, AND 가 OR보다 우선순위가 노기떄문에 괄호붙여준것입니다. 괄호가없다면 다르다.
        // 암튼 논리연산자의 우선순위는  && > ||

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char ch = input.charAt(0);

        System.out.printf("%b%n", '0' <= ch && ch <= '9');
    }
}
