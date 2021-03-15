package chapter5;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[10];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 40;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for(int i = 0; i < 5; i++){
            System.out.println(score[i]);
        }


        //배열의 길이 length를 이용해서 배열 순회
        for(int i2 = 0; i2 < score.length; i2++){
            System.out.println(score[i2]);
        }

        int[] grade = new int[] {1, 2, 3, 4, 5};
        //배열 선언        생성동시에 초기화 (배열길이 안적어.)
        for(int i = 0; i < grade.length; i++){
            System.out.printf("%d ", grade[i]);
        }
        System.out.println();

        int[] grade2 = {1, 2, 3 , 4, 5};
        System.out.printf("grade2 길이 : %d%n", grade2.length);
        // 배열 선언 동시에 초기화(생성 new int[]생략가능)
        for(int i = 0; i < grade2.length; i++){
            System.out.printf("%d ", grade2[i]);
        }
        System.out.println();

        int[] grade3;
//        grade3 = {1, 2, 3, 4, 5} : 에러, 선언따로하면 생성 문법 생략불가
        grade3 = new int[] {1, 2, 3, 4, 5}; // 선언따로하면 생성문법 꼭 써줘야한다 . new int

        int[] grade4 = new int[0];
        int[] grade5 = new int[]{};
        int[] grade6 = {};
        System.out.println(grade4 + " " + grade5 + " " + grade6);

        int[] friends = new int[]{1, 2, 3, 4, 10, 20};
        for(int i = 0; i < friends.length; i++){
            System.out.print(friends[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(friends));
        // 요런식으로 배열 값 확인할때 Arras.toString메소드를 이용하면 쉽게 확인가능

        char[] groups = {'a', 'b', 'c', 'd'};
        System.out.println(groups);
    }
}
