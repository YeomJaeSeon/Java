package chapter5;

import java.util.Arrays;

public class ArrayCounter {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];
        // counter는 int의 default로 0으로 초기화되어있는상태이다!

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();
        for(int i = 0; i < numArr.length; i++){
            counter[numArr[i]]++;
        }
        for(int value : counter){
            System.out.println(value);
        }

        String[] arr = new String[3];
        System.out.println(Arrays.toString(arr));
    }
}
