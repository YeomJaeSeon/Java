package chapter5;

import java.util.Scanner;

public class MultiArr4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chairs", "의자"},
                {"computer", "컴퓨터"},
                {"desk", "책상"},
        };

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < words.length; i++){
            System.out.print(words[i][0] + "을 한국어로 번역하시오. >");
            String input = scanner.nextLine();
            if(input.equals(words[i][1])){
                System.out.println("정답!");
            }else{
                System.out.println("떙!");
            }
        }
    }
}
