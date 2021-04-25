package chapter11.practices;

import chapter5.Array;

import java.util.*;

public class Num10 {
    public static void main(String[] args) {
        Set set = new HashSet(); // 순서X, 중복 X...!!! -> 해싱알고리즘에의해
        // 한숫자가 고저된 위치에 저장.. 그래서 리스트로 바꿔줘야함. 리스트는 순서 O
        int[][] board = new int[5][5];

        for(int i = 0; set.size() < 25; i++){
            set.add((int)(Math.random() * 30) + 1 + "");
        }

        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);


        Iterator it = list.iterator();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
