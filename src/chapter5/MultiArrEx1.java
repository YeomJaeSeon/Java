package chapter5;

import java.util.Scanner;

// 보물찾기
public class MultiArrEx1 {
    public static void main(String[] args) {
        System.out.println((int)'0');
        final int SIZE = 10;
        int x = 0;
        int y = 0;
        int cnt = 0;
        int gameCnt = 0;
        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(shipBoard[i][j] == 1)
                    ++cnt;
            }
        }

        Scanner scanner = new Scanner(System.in);


        while(true){

            System.out.printf("좌표를 입력하세요. (종료는 000) >");
            String input = scanner.nextLine();
            if(input == "000") break;
            if(input.length() == 2){
                // 제대로 입력함.
                x = input.charAt(0) - 48; //char임 x는
                y = input.charAt(1) - 48;

                if(shipBoard[x][y] == 0){
                    board[x][y] = 'X';
                }else{
                    board[x][y] = 'O';
                    ++gameCnt;
                }
            }else{
                // 사용자가 잘못입력
                System.out.println("잘못입력했음. 다시입력해주셈");
                continue;

            }
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for(int i = 0; i < SIZE; i++){
                System.out.print(i +" ");
                for(int j = 0; j < SIZE; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();

            if(cnt == gameCnt) break;
        }
        System.out.println("보물을 다찾았네요!");
    }
}
