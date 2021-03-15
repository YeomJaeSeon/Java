package chapter5;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 연습문제
        //1
        // a : 선언은했는데 생성도안하고 이상함;
        // b : 초기화할때 char 공백이있음. 문자열인가?
        // e : 선언만하고싶으면 int arr[];이렇게해야함

        //2
        //2

        //3
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int value : arr) sum += value;
        System.out.println("sum="+sum);

        //4
        int[][] arr2 = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;
        int cnt = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                total += arr2[i][j];
                ++cnt;
            }
        }

        average = (float)total / cnt;

        System.out.println("total="+total);
        System.out.println("average="+average);

        //5
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];
        for(int i=0; i< ballArr.length;i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[0];
            ballArr[0] = ballArr[j];
            ballArr[j] = tmp;
        }
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        for(int i=0;i<ball3.length;i++) {
            System.out.print(ball3[i]);
        }
System.out.println();
        //6
        int[] coinUnit = {500, 100, 50, 10};
        int money = 2680;
        System.out.println("money="+money);
        for(int i=0;i<coinUnit.length;i++) {
           System.out.printf("%d원: %d%n", coinUnit[i], money / coinUnit[i]);
           money %= coinUnit[i];
        }

        //8
        int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
        int[] counter = new int[4];

        for(int i=0; i < answer.length; i++) {
            counter[answer[i] - 1]++;
        }
        for(int i=0; i < counter.length;i++) {
            System.out.print(i+1+": ");
            for(int j = 0; j < counter[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //9
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };
        char[][] result = new char[star[0].length][star.length];
        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {
                if(star[i][j] == '*'){
                    result[j][star.length - i - 1] = '*';
                }
            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

        //10

        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
                            // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
        String src = "abc123";
        String result1 = "";
// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                result1 += abcCode[(int)ch - 97];
            }
            if(ch >= '0' && ch <= '9'){
                result1 += numCode[(int)ch - 48];
            }
        }
        System.out.println("src:"+src);
        System.out.println("result:"+result1);

        //11 -
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result2 = new int[score.length+1][score[0].length+1];

        for(int i=0; i < score.length;i++) {
            int rowSum3 = 0;
            for(int j=0; j < score[i].length;j++) {
                result2[i][j] = score[i][j];
                rowSum3 += score[i][j];
            }
            result2[i][3] = rowSum3;
        }
        for(int i=0; i < result2.length;i++) {
            for(int j=0; j < result2[i].length;j++) {
                System.out.printf("%4d",result2[i][j]);
            }
            System.out.println();
        }
        //12
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
        };

        Scanner scanner = new Scanner(System.in);
        int cnt5 = 0;
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i][0] + "의 뜻은? ");
            String input = scanner.nextLine();

            if(input.equals(words[i][1])){
                System.out.println("정답입니다.");
                ++cnt5;
            }else{
                System.out.println("틀렸습니다.");
            }

        }
        System.out.println("전체 " + words.length +"문제 중 " +cnt5+"문제 맞추셨습니다.");

        //13
        String[] words2 = { "television", "computer", "mouse", "phone" };
        for(int i=0;i<words2.length;i++) {
            char[] question = words2[i].toCharArray(); // String char[] 을 로 변환

            for(int j = 0; j < 20; j++){
                int randomIdx = (int)(Math.random() * question.length);

                char tmp = ' ';
                tmp = question[0];
                question[0] = question[randomIdx];
                question[randomIdx] = tmp;
            }
            System.out.println(question);

            System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i+1, new String(question));
            String answer2 = scanner.nextLine();

            if(words2[i].equals(answer2.trim()))
                System.out.printf("맞았습니다 .%n%n");
            else
            System.out.printf("틀렸습니다 .%n%n");
        }

    }



}
