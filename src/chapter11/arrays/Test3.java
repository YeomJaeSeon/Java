package chapter11.arrays;

import java.util.Arrays;
// Arrays클래스는 배열다루는 유용한 메서드들을 static으로 제공해준다.
public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int[] arr2 = Arrays.copyOf(arr, 3);
        System.out.println("arr2 = " + Arrays.toString(arr2));
        arr2[0] += 10;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int[] arr5 = new int[10];
        Arrays.fill(arr5, 100);
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));

        int[] arr6 = new int[5];
        Arrays.setAll(arr6, (i) -> (int)(Math.random() * 5) + 1);
        System.out.println("Arrays.toString(arr6) = " + Arrays.toString(arr6));


    }
}
