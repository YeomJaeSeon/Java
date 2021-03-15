package chapter5;

import java.util.Scanner;

public class BingoGame {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[][] board = new int[SIZE][SIZE];
        int tmp = 0;
        int v = 1;

        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                board[i][j] = v;
                ++v;
            }
        }

        int idx1 = 0;
        int idx2 = 0;
        //shuffle
        for(int i = 0; i < 100; i++){
            idx1 = (int)(Math.random() * (SIZE));
            idx2 = (int)(Math.random() * SIZE);
            tmp = board[0][0];
            board[0][0] = board[idx1][idx2];
            board[idx1][idx2] = tmp;
        }

//        for(int i = 0; i < SIZE; i++){
//            for (int j = 0; j < SIZE; j++){
//                System.out.print(board[i][j] +" ");
//            }
//            System.out.println();
//        }
        Scanner scanner = new Scanner(System.in);

        TOTAL:
        while (true){
            for(int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++){
                    System.out.print(board[i][j] +" ");
                }
                System.out.println();
            }
            System.out.print("1부터 25중 숫자 하나 입력해주세영! >");
            int input = scanner.nextInt();
            if(!(input >= 1 && input <= 25)){
                System.out.println("잘못입력하셨어요!");
                continue;
            }

            for(int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++){
                    if(board[i][j] == input){
                        board[i][j] = 0;
                    }
                }
            }

            // bingo check 1bingo여도 끝남
            for(int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++){
                    if(board[i][j] == 0){
                        int checkCnt = 0;
                        for(int k = 0; k < SIZE; k++){
                            if(board[i][k] == 0) ++checkCnt;
                        }
                        if(checkCnt == SIZE) {
                            System.out.println("빙고 성공!!");
                            break TOTAL;
                        }
                        checkCnt = 0;
                        for(int k = 0; k < SIZE; k++){
                            if(board[k][i] == 0) ++checkCnt;
                        }
                        if(checkCnt == SIZE) {
                            System.out.println("빙고 성공!!");
                            break TOTAL;
                        }
                        if(i == 0 && j == 0 || i == 4 && j == 0 || i == 0 && j == 4 || i == 4 && j == 4){
                            checkCnt = 0;
                            for(int k = 0; k < SIZE; k++){
                                if(board[k][k] == 0) ++checkCnt;
                            }
                            if(checkCnt == SIZE){
                                System.out.println("빙고 성공!!");
                                break TOTAL;
                            }
                        }
                    }
                }
            }


        }
    }
}
