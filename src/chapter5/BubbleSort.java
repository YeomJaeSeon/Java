package chapter5;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++){
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println();

        for(int i = 0; i < numArr.length - 1; i++){
            boolean changed = false;
            for(int j = 0; j < numArr.length - 1 - i; j++){
                if(numArr[j] > numArr[j + 1]){
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;
                    changed = true; //자리바꿈 발생
                }
            }
            if(!changed) break;
            System.out.println(Arrays.toString(numArr));
        }
    }
}
